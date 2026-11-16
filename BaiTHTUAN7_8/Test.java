
public class Test {
    public static void main(String[] args) {

        // Tao doi tuong Sach
        Sach s1 = new Sach("S01", "Lap trinh Java co ban", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu va giai thuat", "Tran Thi B", 2021, 5);
        Sach s3 = new Sach("S03", "Co so du lieu", "Le Van C", 2023, 8);

        // Hien thi thong tin sach
        System.out.println("=== DANH SACH SACH ===");

        s1.hienThiThongTin();
        s2.hienThiThongTin();
        s3.hienThiThongTin();

        // Kiem tra nam xuat ban
        System.out.println("=== KIEM TRA DUNG THI CAP NHAT LAI NAM XUAT BAN ===");
        s1.setNamXuatBan(2030);

        // Kiem tra so luong
        System.out.println("=== KIEM TRA DUNG THI CAP NHAT LAI SO LUONG SACH ===");
        s1.setSoLuong(-5);

        // Hien thi lai thong tin sach
        System.out.println("=== THONG TIN SACH SAU KHI KIEM TRA VA CAP NHAT===");
        s1.hienThiThongTin();
    }
}
