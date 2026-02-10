package com.dev.backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "chi_tiet_kiem_ke")
public class ChiTietKiemKe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "dot_kiem_ke_id", nullable = false)
    private DotKiemKe dotKiemKe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bien_the_san_pham_id", nullable = false)
    private BienTheSanPham bienTheSanPham;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lo_hang_id", nullable = false)
    private LoHang loHang;

    @NotNull
    @ColumnDefault("0.000")
    @Column(name = "so_luong_he_thong", nullable = false, precision = 15, scale = 3)
    private BigDecimal soLuongHeThong;

    @Column(name = "gia_von_he_thong", precision = 15, scale = 2)
    private BigDecimal giaVonHeThong;

    @ColumnDefault("0.000")
    @Column(name = "so_luong_thuc_te", precision = 15, scale = 3)
    private BigDecimal soLuongThucTe;

    @Column(name = "gia_von_thuc_te", precision = 15, scale = 2)
    private BigDecimal giaVonThucTe;

    @ColumnDefault("0.000")
    @Column(name = "chenh_lech_so_luong", precision = 15, scale = 3)
    private BigDecimal chenhLechSoLuong;

    @ColumnDefault("0.00")
    @Column(name = "ti_le_chenh_lech", precision = 10, scale = 2)
    private BigDecimal tiLeChenhLech;

    @ColumnDefault("0.00")
    @Column(name = "gia_tri_chenh_lech", precision = 15, scale = 2)
    private BigDecimal giaTriChenhLech;

    @Column(name = "loai_chenh_lech")
    private String loaiChenhLech;

    @Size(max = 200)
    @Column(name = "vi_tri_kho", length = 200)
    private String viTriKho;

    @ColumnDefault("1")
    @Column(name = "lan_kiem_dem")
    private Byte lanKiemDem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nguoi_kiem_dem_id")
    private NguoiDung nguoiKiemDem;

    @Column(name = "ngay_kiem_dem")
    private Instant ngayKiemDem;

    @ColumnDefault("0")
    @Column(name = "trang_thai")
    private Boolean trangThai;

    @Lob
    @Column(name = "ly_do_chenh_lech")
    private String lyDoChenhLech;

    @Lob
    @Column(name = "bien_phap_xu_ly")
    private String bienPhapXuLy;

    @Lob
    @Column(name = "ghi_chu")
    private String ghiChu;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_cap_nhat")
    private Instant ngayCapNhat;


}