public class Sach {
    // Yêu cầu 1: Khai báo các thuộc tính
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Hàm khởi tạo không tham số
    public Sach() {
    }

    // Hàm khởi tạo đầy đủ tham số để dễ dàng tạo đối tượng
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Các phương thức Getter và Setter (giúp truy xuất/sửa dữ liệu nếu cần)
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // Yêu cầu 2: Phương thức in thông tin chi tiết của cuốn sách
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach 
                + " | Tieu de: " + tieuDe 
                + " | Tac gia: " + tacGia 
                + " | Nam XB: " + namXuatBan 
                + " | So luong: " + soLuong);
    }
}
