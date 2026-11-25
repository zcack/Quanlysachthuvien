
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {

    private String tinhTrang;

    // Constructor mac dinh
    public SachGiaoKhoa() {
        super();
    }

    // Constructor co tham so
    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong,
                        String nhaXuatBan, String tinhTrang) {

        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    // Nhap sach giao khoa
    public void nhapSGK(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap tinh trang (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    // Xuat sach giao khoa
    public void xuatSGK() {
        super.xuat();

        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + tinhTienSGK());
    }

    // Tinh thanh tien sach giao khoa
    public double tinhTienSGK() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        }
        else {
            return soLuong * donGia * 0.5;
        }
    }
}
