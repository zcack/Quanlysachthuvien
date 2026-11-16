
import java.time.Year;

public class Sach {
    // Yêu cầu 1: Khai báo các thuộc tính private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Hàm khởi tạo không tham số
    public Sach() {
    }

    // Yêu cầu 4: Hàm khởi tạo đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Getter và Setter cho maSach
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter và Setter cho tieuDe
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    // Getter và Setter cho tacGia
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Yêu cầu 3: Kiểm tra năm xuất bản
    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    // Yêu cầu 3: Kiểm tra số lượng
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong duoc am!");
        }
    }

    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach
                + " | Tieu de: " + tieuDe
                + " | Tac gia: " + tacGia
                + " | Nam XB: " + namXuatBan
                + " | So luong: " + soLuong);
    }
}
