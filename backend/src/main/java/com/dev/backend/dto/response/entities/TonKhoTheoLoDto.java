package com.dev.backend.dto.response.entities;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link com.dev.backend.entities.TonKhoTheoLo}
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@EqualsAndHashCode(of = {"id"})
public class TonKhoTheoLoDto implements Serializable {
    Integer id;
    @NotNull
    LoHangDto loHang;
    @NotNull
    KhoDto kho;
    BigDecimal soLuongTon;
    BigDecimal soLuongDaDat;
    BigDecimal soLuongKhaDung;
    Instant ngayNhapGanNhat;
    Instant ngayXuatGanNhat;
    Instant lanCapNhatCuoi;
}