
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Nhap sach giao khoa");
            System.out.println("2. Nhap sach tham khao");
            System.out.println("3. Xuat sach giao khoa");
            System.out.println("4. Xuat sach tham khao");
            System.out.println("5. Tinh tong thanh tien sach giao khoa");
            System.out.println("6. Tinh tong thanh tien sach tham khao");
            System.out.println("7. Tinh trung binh don gia sach tham khao");
            System.out.println("8. Xuat sach giao khoa cua nha xuat ban X");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                // Nhap sach giao khoa
                case 1:
                    System.out.print("Nhap so luong sach giao khoa: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap sach giao khoa thu " + (i + 1));

                        SachGiaoKhoa sgk = new SachGiaoKhoa();
                        sgk.nhapSGK(sc);

                        dsSGK.add(sgk);
                    }
                    break;

                // Nhap sach tham khao
                case 2:
                    System.out.print("Nhap so luong sach tham khao: ");
                    int m = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < m; i++) {
                        System.out.println("\nNhap sach tham khao thu " + (i + 1));

                        SachThamKhao stk = new SachThamKhao();
                        stk.nhapSTK(sc);

                        dsSTK.add(stk);
                    }
                    break;

                // Xuat sach giao khoa
                case 3:
                    System.out.println("\n===== DANH SACH SACH GIAO KHOA =====");

                    for (int i = 0; i < dsSGK.size(); i++) {
                        dsSGK.get(i).xuatSGK();
                        System.out.println("----------------------");
                    }
                    break;

                // Xuat sach tham khao
                case 4:
                    System.out.println("\n===== DANH SACH SACH THAM KHAO =====");

                    for (int i = 0; i < dsSTK.size(); i++) {
                        dsSTK.get(i).xuatSTK();
                        System.out.println("----------------------");
                    }
                    break;

                // Tong thanh tien sach giao khoa
                case 5:
                    double tongSGK = 0;

                    for (int i = 0; i < dsSGK.size(); i++) {
                        tongSGK += dsSGK.get(i).tinhTienSGK();
                    }

                    System.out.println("Tong thanh tien SGK: " + tongSGK);
                    break;

                // Tong thanh tien sach tham khao
                case 6:
                    double tongSTK = 0;

                    for (int i = 0; i < dsSTK.size(); i++) {
                        tongSTK += dsSTK.get(i).tinhTienSTK();
                    }

                    System.out.println("Tong thanh tien STK: " + tongSTK);
                    break;

                // Trung binh cong don gia sach tham khao
                case 7:
                    double tongDonGia = 0;

                    for (int i = 0; i < dsSTK.size(); i++) {
                        tongDonGia += dsSTK.get(i).getDonGia();
                    }

                    if (dsSTK.size() > 0) {
                        double trungBinh = tongDonGia / dsSTK.size();

                        System.out.println("Trung binh don gia STK: " + trungBinh);
                    } else {
                        System.out.println("Danh sach sach tham khao rong!");
                    }
                    break;

                // Xuat sach giao khoa cua nha xuat ban X
                case 8:
                    System.out.println("\n===== SACH GIAO KHOA CUA NHA XUAT BAN X =====");

                    for (int i = 0; i < dsSGK.size(); i++) {
                        if (dsSGK.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                            dsSGK.get(i).xuatSGK();
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
