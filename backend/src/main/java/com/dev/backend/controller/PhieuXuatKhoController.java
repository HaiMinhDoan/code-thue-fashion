package com.dev.backend.controller;

import com.dev.backend.config.SecurityContextHolder;
import com.dev.backend.constant.enums.FilterLogicType;
import com.dev.backend.constant.enums.FilterOperation;
import com.dev.backend.constant.variables.IRoleType;
import com.dev.backend.customizeanotation.RequireAuth;
import com.dev.backend.dto.request.BaseFilterRequest;
import com.dev.backend.dto.request.FilterCriteria;
import com.dev.backend.dto.response.ResponseData;
import com.dev.backend.dto.response.entities.PhieuXuatKhoDto;
import com.dev.backend.exception.customize.CommonException;
import com.dev.backend.mapper.PhieuXuatKhoMapper;
import com.dev.backend.services.impl.entities.PhieuXuatKhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/phieu-xuat-kho")
public class PhieuXuatKhoController {

    @Autowired
    private PhieuXuatKhoService phieuXuatKhoService;

    @Autowired
    private PhieuXuatKhoMapper phieuXuatKhoMapper;


    // Bình
    @PostMapping("/filter")
    @RequireAuth(
            roles = {
                    IRoleType.quan_tri_vien,
                    IRoleType.quan_ly_kho,
                    IRoleType.nhan_vien_kho
            },
            inWarehouse = true
    )
    public ResponseEntity<ResponseData<Page<PhieuXuatKhoDto>>> filter(@RequestBody BaseFilterRequest filter) {
        List<FilterCriteria> filters = filter.getFilters();
        if (filters == null) {
            filters = new ArrayList<>();
        }

        // Đảm bảo là mutable list
        if (!(filters instanceof ArrayList)) {
            filters = new ArrayList<>(filters);
        }

        FilterCriteria khoFilter = FilterCriteria.builder()
                .fieldName("kho.id")
                .operation(FilterOperation.EQUALS)
                .value(SecurityContextHolder.getKhoId())
                .logicType(FilterLogicType.AND)
                .build();

        filters.add(0, khoFilter);
        filter.setFilters(filters);
        return ResponseEntity.ok(
                ResponseData.<Page<PhieuXuatKhoDto>>builder()
                        .status(HttpStatus.OK.value())
                        .data(phieuXuatKhoMapper.toDtoPage(phieuXuatKhoService.filter(filter)))
                        .build()
        );
    }

    @PostMapping("/get-by-id/{id}")
    @RequireAuth(
            roles = {
                    IRoleType.quan_tri_vien,
                    IRoleType.quan_ly_kho,
                    IRoleType.nhan_vien_kho
            },
            inWarehouse = true
    )
    public ResponseEntity<ResponseData<PhieuXuatKhoDto>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                ResponseData.<PhieuXuatKhoDto>builder()
                        .status(HttpStatus.OK.value())
                        .data(
                                phieuXuatKhoMapper.toDto(phieuXuatKhoService.getOne(id).orElseThrow(
                                        () -> new CommonException("Không tìm thấy phiếu xuất kho id: " + id)
                                ))
                        )
                        .build()
        );
    }
}