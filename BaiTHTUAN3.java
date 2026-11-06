import java.util.Scanner;

public class BaiTHTUAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TUAN 5: Khai bao mang co ban de quan ly toi da 100 cuon sach
        int MAX = 100;
        String[] maSach = new String[MAX];
        String[] tenSach = new String[MAX];
        String[] tacGia = new String[MAX];
        int[] namXuatBan = new int[MAX];
        int[] soLuong = new int[MAX];
        double[] donGia = new double[MAX];
        String[] loaiSach = new String[MAX];

        int n = 0; // Bien luu so luong sach hien co trong he thong
        int chonMenu;

        // TUAN 5 - BAI 3: Vong lap do-while giu Menu lap den khi chon thoat
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Nhap danh sach sach moi ");
            System.out.println("2. Tinh tong so luong va tong gia tri sach ");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Hien thi thong tin va Phan loai toan bo kho sach ");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Moi ban nhap lua chon (0-4): ");
            chonMenu = sc.nextInt();
            sc.nextLine(); // Xoa bo nho dem

            switch (chonMenu) {
                case 1:
                    // TUAN 5 - BAI 1: Nhap n sach bang vong lap
                    System.out.print("Ban muon nhap them bao nhieu cuon sach? ");
                    int soLuongNhap = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < soLuongNhap; i++) {
                        if (n >= MAX) {
                            System.out.println("He thong bo nho thu vien da day, khong the them tiep!");
                            break;
                        }
                        System.out.println("\n--- Nhap cuon sach thu " + (n + 1) + " ---");

                        // TUAN 3: Nhap thong tin co ban cua sach
                        System.out.print("Nhap ma sach: ");
                        maSach[n] = sc.nextLine();

                        System.out.print("Nhap ten sach: ");
                        tenSach[n] = sc.nextLine();

                        System.out.print("Nhap tac gia: ");
                        tacGia[n] = sc.nextLine();

                        // TUAN 4 - BAI 1: kiem tra gia >0, so luong >=0, nam xuat ban hop le
                        int namXB;
                        do {
                            System.out.print("Nhap nam xuat ban (hop le tu 0 den 2026): ");
                            namXB = sc.nextInt();
                            if (namXB <= 0 || namXB > 2026) {
                                System.out.println("Nam xuat ban khong hop le! Vui long nhap lai.");
                            }
                        } while (namXB <= 0 || namXB > 2026);
                        namXuatBan[n] = namXB;

                        double gia;
                        do {
                            System.out.print("Nhap don gia (> 0): ");
                            gia = sc.nextDouble();
                            if (gia <= 0) {
                                System.out.println("Don gia khong hop le! Vui long nhap lai.");
                            }
                        } while (gia <= 0);
                        donGia[n] = gia;

                        int sl;
                        do {
                            System.out.print("Nhap so luong (>= 0): ");
                            sl = sc.nextInt();
                            if (sl < 0) {
                                System.out.println("So luong khong hop le! Vui long nhap lai.");
                            }
                        } while (sl < 0);
                        soLuong[n] = sl;

                        // TUAN 4 - BAI 4: SWITCH CHON LOAI SACH
                        System.out.println("--- Chon loai sach ---");
                        System.out.println("1. Sach giao khoa");
                        System.out.println("2. Sach tham khao");
                        System.out.println("3. Sach chuyen nganh");
                        System.out.println("4. Sach khac");
                        System.out.print("Nhap lua chon loai: ");
                        int luaChonLoai = sc.nextInt();
                        sc.nextLine();

                        switch (luaChonLoai) {
                            case 1:
                                loaiSach[n] = "Sach giao khoa";
                                break;
                            case 2:
                                loaiSach[n] = "Sach tham khao";
                                break;
                            case 3:
                                loaiSach[n] = "Sach chuyen nganh";
                                break;
                            default:
                                loaiSach[n] = "Sach khac";
                                break;
                        }
                        n++; // Tang so luong sach hien co
                    }
                    System.out.println("\n=> Da cap nhat thanh cong danh sach sach vao he thong!");
                    break;
                case 2:
                    // TUAN 5 - BAI 2: tinh tong so luong va tong gia tri sach
                    if (n == 0) {
                        System.out.println("Thu vien trong! Vui long chon chuc nang 1 de them sach.");
                        break;
                    }

                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i]; // Cong don so luong sach
                        
                        // TUAN 3: Tinh toan Thanh tien tung cuon va cong don
                        double thanhTienCuon = donGia[i] * soLuong[i];
                        tongGiaTri += thanhTienCuon;
                    }

                    System.out.println("\n===== BAO CAO KHO SACH (BAI 2) =====");
                    System.out.println("-> Tong so luong sach trong thu vien: " + tongSoLuong + " cuon.");
                    System.out.println("-> Tong gia tri sach hien tai: " + tongGiaTri + " VND");
                    break;

                case 3:
                    // TUAN 5 - BAI 4: Tim sach theo ma bang vong lap for
                    if (n == 0) {
                        System.out.println("He thong chua co sach de tim kiem!");
                        break;
                    }

                    System.out.print("Nhap ma sach ban can tim kiem: ");
                    String timMa = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(timMa)) {
                            System.out.println("\n=> DA TIM THAY SACH:");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Loai sach: " + loaiSach[i]);
                            System.out.println("Don gia: " + donGia[i] + " | So luong ton: " + soLuong[i]);
                            timThay = true;
                            break; // Tim thay thi thoat vong lap
                        }
                    }

                    if (!timThay) {
                        System.out.println("=> Khong tim thay cuon sach nao co ma: " + timMa);
                    }
                    break;

                case 4:
                    // THONG KE CHI TIET & IN HOA DON NHAP KHO 
                    if (n == 0) {
                        System.out.println("Khong co du lieu hien thi!");
                        break;
                    }

                    System.out.println("\n==================== DANH SACH TOAN BO SACH TRONG THU VIEN ====================");
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Sach [" + maSach[i] + "] - " + tenSach[i] + " ---");
                        System.out.println("Tac gia: " + tacGia[i] + " | Nam XB: " + namXuatBan[i] + " | The loai: " + loaiSach[i]);
                        
                        // TUAN 4 - BAI 2: Phan loai gia sach 
                        System.out.print("Phan loai gia: ");
                        if (donGia[i] < 50000) {
                            System.out.println("Sach gia thap");
                        } else if (donGia[i] < 100000) {
                            System.out.println("Sach gia trung binh");
                        } else if (donGia[i] <= 200000) {
                            System.out.println("Sach gia cao");
                        } else {
                            System.out.println("Sach gia dac biet");
                        }

                        // TUAN 4 - BAI 3: Phan loai tinh trang ton kho
                        System.out.print("Tinh trang kho: ");
                        if (soLuong[i] == 0) {
                            System.out.println("Het sach");
                        } else if (soLuong[i] <= 5) {
                            System.out.println("Sach sap het");
                        } else if (soLuong[i] <= 20) {
                            System.out.println("Con it sach");
                        } else {
                            System.out.println("Con nhieu sach");
                        }

                        // TUAN 3: Tinh toan hoa don chi tiet tung dau sach
                        double thanhTien = donGia[i] * soLuong[i];
                        double phiVanChuyen = thanhTien * 0.05;
                        double tongTien = thanhTien + phiVanChuyen;

                        System.out.println("Thanh tien: " + thanhTien + " VND");
                        System.out.println("Phi van chuyen (5%): " + phiVanChuyen + " VND");
                        System.out.println("Tong tien nhap kho: " + tongTien + " VND");
                    }
                    System.out.println("===============================================================================");
                    break;

                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh quan ly thu vien!");
                    break;

                default:
                    System.out.println("Lua chon menu khong hop le! Vui long nhap so tu 0 den 4.");
            }

        } while (chonMenu != 0);

        sc.close();
    }
}
