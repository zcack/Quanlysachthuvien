
import java.util.ArrayList;
import java.util.Scanner;

// Lop Sach luu thong tin cua mot cuon sach
class Sach {
    String maSach;
    String tenSach;
    String tacGia;
    int namXuatBan;
    int soLuong;
    double donGia;
    String loaiSach;

    public Sach(String maSach, String tenSach, String tacGia,
                int namXuatBan, int soLuong, double donGia,
                String loaiSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.loaiSach = loaiSach;
    }
}

public class BaiTHTUAN3 {

    static Scanner sc = new Scanner(System.in);

    // ArrayList luu thong tin sach
    static ArrayList<Sach> danhSachSach = new ArrayList<>();

    // ArrayList luu ma sach
    static ArrayList<String> danhSachMaSach = new ArrayList<>();

    // Ham nhap so nguyen co kiem tra
    public static int nhapSoNguyen(String thongBao) {
        while (true) {
            try {
                System.out.print(thongBao);
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }

    // Ham nhap so thuc co kiem tra
    public static double nhapSoThuc(String thongBao) {
        while (true) {
            try {
                System.out.print(thongBao);
                double n = Double.parseDouble(sc.nextLine());

                if (Double.isNaN(n) || Double.isInfinite(n)) {
                    System.out.println("Gia tri khong hop le!");
                    continue;
                }

                return n;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
            }
        }
    }

    // Ham tim vi tri sach theo ma
    public static int timViTri(String ma) {
        for (int i = 0; i < danhSachMaSach.size(); i++) {
            if (danhSachMaSach.get(i).equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // Ham nhap thong tin sach
    public static Sach nhapSach() {

        String ma;

        do {
            System.out.print("Nhap ma sach: ");
            ma = sc.nextLine().trim();

            if (ma.isEmpty()) {
                System.out.println("Ma sach khong duoc de trong!");
            }
        } while (ma.isEmpty());

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        int nam;
        do {
            nam = nhapSoNguyen("Nhap nam xuat ban (1-2026): ");

            if (nam <= 0 || nam > 2026) {
                System.out.println("Nam xuat ban khong hop le!");
            }
        } while (nam <= 0 || nam > 2026);

        double gia;
        do {
            gia = nhapSoThuc("Nhap don gia (> 0): ");

            if (gia <= 0) {
                System.out.println("Don gia khong hop le!");
            }
        } while (gia <= 0);

        int sl;
        do {
            sl = nhapSoNguyen("Nhap so luong (>= 0): ");

            if (sl < 0) {
                System.out.println("So luong khong hop le!");
            }
        } while (sl < 0);

        int chonLoai;
        do {
            System.out.println("--- CHON LOAI SACH ---");
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.println("3. Sach chuyen nganh");
            System.out.println("4. Sach khac");

            chonLoai = nhapSoNguyen("Nhap lua chon loai: ");

            if (chonLoai < 1 || chonLoai > 4) {
                System.out.println("Loai sach khong hop le!");
            }
        } while (chonLoai < 1 || chonLoai > 4);

        String loai;

        switch (chonLoai) {
            case 1: loai = "Sach giao khoa";
                break;
            case 2: loai = "Sach tham khao";
                break;
            case 3: loai = "Sach chuyen nganh";
                break;
            default: loai = "Sach khac";
        }

        return new Sach(ma, ten, tacGia, nam, sl, gia, loai);
    }

    // BAI 1: Nhap mang so luong 5 cuon sach
    public static void bai1() {

        int[] soLuong = new int[5];

        int tong = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {

            do {
                soLuong[i] = nhapSoNguyen(
                    "Nhap so luong sach thu " + (i + 1) + ": "
                );

                if (soLuong[i] < 0) {
                    System.out.println("So luong khong hop le!");
                }
            } while (soLuong[i] < 0);

            tong += soLuong[i];

            if (i == 0 || soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("\n===== DANH SACH SO LUONG =====");

        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // BAI 2: Nhap n sach bang vong lap
    public static void nhapNSach() {

        int n;

        do {
            n = nhapSoNguyen("Nhap so luong sach can nhap: ");

            if (n < 0) {
                System.out.println("So luong sach khong hop le!");
            }
        } while (n < 0);

        for (int i = 0; i < n; i++) {

            System.out.println("\n===== NHAP SACH THU " + (i + 1) + " =====");

            Sach sachMoi = nhapSach();

            if (timViTri(sachMoi.maSach) != -1) {
                System.out.println("Ma sach da ton tai! Vui long nhap lai sach nay.");
                i--;
            } else {
                danhSachSach.add(sachMoi);
                danhSachMaSach.add(sachMoi.maSach);
                System.out.println("=> Them sach thanh cong!");
            }
        }
    }

    // CHUC NANG 1: Them sach
    public static void themSach() {

        System.out.println("--- NHAP THONG TIN SACH ---");

        Sach sachMoi = nhapSach();

        if (timViTri(sachMoi.maSach) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        danhSachSach.add(sachMoi);
        danhSachMaSach.add(sachMoi.maSach);

        System.out.println("=> Them sach thanh cong!");
    }

    // CHUC NANG 2: Hien thi sach
    public static void hienThiSach() {

        if (danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach!");
            return;
        }

        System.out.println("\n===== DANH SACH TOAN BO SACH =====");

        for (int i = 0; i < danhSachSach.size(); i++) {

            Sach s = danhSachSach.get(i);

            System.out.println("\n--- SACH THU " + (i + 1) + " ---");

            System.out.println("Ma sach: " + s.maSach);
            System.out.println("Ten sach: " + s.tenSach);
            System.out.println("Tac gia: " + s.tacGia);
            System.out.println("Nam xuat ban: " + s.namXuatBan);
            System.out.println("Loai sach: " + s.loaiSach);
            System.out.println("Don gia: " + s.donGia);
            System.out.println("So luong: " + s.soLuong);

            // Phan loai gia sach
            System.out.print("Phan loai gia: ");

            if (s.donGia < 50000) {
                System.out.println("Sach gia thap");
            } else if (s.donGia < 100000) {
                System.out.println("Sach gia trung binh");
            } else if (s.donGia <= 200000) {
                System.out.println("Sach gia cao");
            } else {
                System.out.println("Sach gia dac biet");
            }

            // Phan loai ton kho
            System.out.print("Tinh trang kho: ");

            if (s.soLuong == 0) {
                System.out.println("Het sach");
            } else if (s.soLuong <= 5) {
                System.out.println("Sach sap het");
            } else if (s.soLuong <= 20) {
                System.out.println("Con it sach");
            } else {
                System.out.println("Con nhieu sach");
            }

            // Tinh thanh tien
            double thanhTien = s.donGia * s.soLuong;

            // Phi van chuyen 5%
            double phiVanChuyen = thanhTien * 0.05;

            // Tong tien nhap
            double tongTien = thanhTien + phiVanChuyen;

            System.out.println("Thanh tien: " + thanhTien + " VND");
            System.out.println("Phi van chuyen: " + phiVanChuyen + " VND");
            System.out.println("Tong tien nhap: " + tongTien + " VND");
        }
    }

    // CHUC NANG 3: Tim sach theo ma
    public static void timSach() {

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            Sach s = danhSachSach.get(viTri);

            System.out.println("\n===== THONG TIN SACH =====");
            System.out.println("Ma sach: " + s.maSach);
            System.out.println("Ten sach: " + s.tenSach);
            System.out.println("Tac gia: " + s.tacGia);
            System.out.println("Nam xuat ban: " + s.namXuatBan);
            System.out.println("Loai sach: " + s.loaiSach);
            System.out.println("Don gia: " + s.donGia);
            System.out.println("So luong: " + s.soLuong);
        }
    }

    // CHUC NANG 4: Xoa sach
    public static void xoaSach() {

        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach can xoa!");
        } else {
            danhSachSach.remove(viTri);
            danhSachMaSach.remove(viTri);

            System.out.println("=> Xoa sach thanh cong!");
        }
    }

    // CHUC NANG 5: Sua sach
    public static void suaSach() {

        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }

        System.out.println("Nhap thong tin moi cua sach:");

        Sach sachMoi = nhapSach();

        int viTriMaMoi = timViTri(sachMoi.maSach);

        if (viTriMaMoi != -1 && viTriMaMoi != viTri) {
            System.out.println("Ma sach moi da ton tai!");
            return;
        }

        danhSachSach.set(viTri, sachMoi);
        danhSachMaSach.set(viTri, sachMoi.maSach);

        System.out.println("=> Sua sach thanh cong!");
    }

    // CHUC NANG 6: Tinh tong so luong
    public static void tinhTongSoLuong() {

        int tongSoLuong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            tongSoLuong += danhSachSach.get(i).soLuong;
        }

        System.out.println("Tong so luong sach: " + tongSoLuong);
    }

    // CHUC NANG 7: Tinh tong gia tri
    public static void tinhTongGiaTri() {

        double tongGiaTri = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {

            Sach s = danhSachSach.get(i);

            tongGiaTri += s.donGia * s.soLuong;
        }

        System.out.println("Tong gia tri sach: " + tongGiaTri + " VND");
    }

    // BAI 3: Hien thi danh sach ma sach
    public static void hienThiMaSach() {

        if (danhSachMaSach.isEmpty()) {
            System.out.println("Danh sach ma sach rong!");
            return;
        }

        System.out.println("\n===== DANH SACH MA SACH =====");

        for (int i = 0; i < danhSachMaSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachMaSach.get(i));
        }
    }

    // BAI 3: Tim ma sach
    public static void timMaSach() {

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay ma sach!");
        } else {
            System.out.println("Tim thay ma sach: " + danhSachMaSach.get(viTri));
        }
    }

    // MENU CHINH
    public static void main(String[] args) {

        int chonMenu;

        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("9. Nhap n sach bang vong lap");
            System.out.println("10. Bai 1 - Nhap mang so luong 5 sach");
            System.out.println("11. Hien thi danh sach ma sach");
            System.out.println("12. Tim ma sach");
            System.out.println("===========================================");

            chonMenu = nhapSoNguyen("Moi ban nhap lua chon (1-12): ");

            switch (chonMenu) {

                case 1: themSach();
                    break;

                case 2: hienThiSach();
                    break;

                case 3: timSach();
                    break;

                case 4: xoaSach();
                    break;

                case 5: suaSach();
                    break;

                case 6: tinhTongSoLuong();
                    break;

                case 7: tinhTongGiaTri();
                    break;

                case 8: System.out.println("Cam on ban da su dung chuong trinh!");
                    break;

                case 9: nhapNSach();
                    break;

                case 10: bai1();
                    break;

                case 11: hienThiMaSach();
                    break;

                case 12: timMaSach();
                    break;

                default: System.out.println("Lua chon khong hop le!");
            }

        } while (chonMenu != 8);

        sc.close();
    }
}
