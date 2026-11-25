
import java.util.Scanner;

public class SachThamKhao extends Sach {

    private double thue;

    // Constructor mac dinh
    public SachThamKhao() {
        super();
    }

    // Constructor co tham so
    public SachThamKhao(String maSach, String ngayNhap,
                        double donGia, int soLuong,
                        String nhaXuatBan, double thue) {

        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    // Nhap sach tham khao
    public void nhapSTK(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    // Xuat sach tham khao
    public void xuatSTK() {
        super.xuat();

        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + tinhTienSTK());
    }

    // Tinh thanh tien sach tham khao
    public double tinhTienSTK() {
        return soLuong * donGia + thue;
    }
}
