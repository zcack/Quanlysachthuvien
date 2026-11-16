import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Yêu cầu 3: Tạo các đối tượng từ lớp Sach
        Sach s1 = new Sach("S01", "Lap trinh Java co ban", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu và giai thuat", "Tran Thi B", 2021, 5);
        Sach s3 = new Sach("S03", "Co so du lieu", "Le Van C", 2023, 8);

        // Yêu cầu 4: Tạo và quản lý danh sách Sach bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        
        // Thêm sách vào danh sách
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        // Duyệt danh sách và in thông tin từng cuốn sách ra màn hình
        System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}
