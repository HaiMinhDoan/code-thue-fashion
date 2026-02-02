package com.dev.backend.mapper;

import com.dev.backend.dto.response.entities.PhieuXuatKhoDto;
import com.dev.backend.entities.PhieuXuatKho;
import org.mapstruct.*;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PhieuXuatKhoMapper {
    PhieuXuatKho toEntity(PhieuXuatKhoDto phieuXuatKhoDto);

    PhieuXuatKhoDto toDto(PhieuXuatKho phieuXuatKho);

    List<PhieuXuatKhoDto> toDtoList(List<PhieuXuatKho> list);

    default Page<PhieuXuatKhoDto> toDtoPage(Page<PhieuXuatKho> page){
        if(page.isEmpty()) return Page.empty();
        return page.map(this::toDto);
    }
}