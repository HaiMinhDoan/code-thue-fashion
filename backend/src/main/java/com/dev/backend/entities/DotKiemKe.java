package com.dev.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "dot_kiem_ke")
public class DotKiemKe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "ma_dot_kiem_ke", nullable = false, length = 50)
    private String maDotKiemKe;

    @Size(max = 200)
    @NotNull
    @Column(name = "ten_dot_kiem_ke", nullable = false, length = 200)
    private String tenDotKiemKe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kho_id", nullable = false)
    private Kho kho;

    @ColumnDefault("'toan_bo'")
    @Column(name = "loai_kiem_ke")
    private String loaiKiemKe;

    @NotNull
    @Column(name = "ngay_bat_dau", nullable = false)
    private Instant ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Instant ngayKetThuc;

    @Column(name = "ngay_hoan_thanh")
    private Instant ngayHoanThanh;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Boolean trangThai;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nguoi_chu_tri_id", nullable = false)
    private NguoiDung nguoiChuTri;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nguoi_duyet_id")
    private NguoiDung nguoiDuyet;

    @Column(name = "ngay_duyet")
    private Instant ngayDuyet;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ly_do")
    private String lyDo;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_cap_nhat")
    private Instant ngayCapNhat;


}