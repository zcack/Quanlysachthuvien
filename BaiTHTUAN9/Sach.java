
import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    // Constructor mac dinh
    public Sach() {
    }

    // Constructor co tham so
    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) 
    {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    // Nhap thong tin chung
    public void nhap(Scanner sc) 
    {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ngay nhap (dd/mm/yyyy): ");
        ngayNhap = sc.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    // Xuat thong tin chung
    public void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
}
