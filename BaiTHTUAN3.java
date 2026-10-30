
import java.util.Scanner;

public class BaiTHTUAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();


        // TUAN 4 - BAI 1
        // KIEM TRA TINH HOP LE

        System.out.println("\n===== KIEM TRA HOP LE =====");

        boolean hopLe = true;

        if (donGia > 0) {
            System.out.println("Don gia hop le!");
        } else {
            System.out.println("Don gia khong hop le!");
            hopLe = false;
        }

        if (soLuong >= 0) {
            System.out.println("So luong hop le!");
        } else {
            System.out.println("So luong khong hop le!");
            hopLe = false;
        }

        if (namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("Nam xuat ban hop le!");
        } else {
            System.out.println("Nam xuat ban khong hop le!");
            hopLe = false;
        }

        if (hopLe) {
            System.out.println("Thong tin sach hop le!");
        }

        // TUAN 4 - BAI 2
        // PHAN LOAI GIA SACH

        System.out.println("\n===== PHAN LOAI GIA SACH =====");

        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia >= 50000 && donGia < 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia >= 100000 && donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else if (donGia > 200000) {
            System.out.println("Sach gia dac biet");
        }

        // TUAN 4 - BAI 3
        // PHAN LOAI TON KHO

        System.out.println("\n===== PHAN LOAI TON KHO =====");

        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Sach sap het");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Con it sach");
        } else if (soLuong > 20) {
            System.out.println("Con nhieu sach");
        }

        // TUAN 4 - BAI 4
        // SWITCH CHON LOAI SACH

        System.out.println("\n===== CHON LOAI SACH =====");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap lua chon: ");
        int loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }

        // Hien thi thong tin sach
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        if (hopLe) {
            double thanhTien = donGia * soLuong;
            double phiVanChuyen = thanhTien * 0.05;
            double tongTien = thanhTien + phiVanChuyen;

            System.out.println("Thanh tien: " + thanhTien);
            System.out.println("Phi van chuyen: " + phiVanChuyen);
            System.out.println("Tong tien nhap: " + tongTien);
        } 
        else {
            System.out.println("Khong the tinh tien vi thong tin khong hop le!");
        }

        sc.close();
    }
}
