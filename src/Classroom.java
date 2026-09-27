import java.util.ArrayList;

public class Classroom {
    private String tenLop;
    private ArrayList<Student> dsSinhVien;

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        this.dsSinhVien = new ArrayList<>();
    }

    public void addStudent(Student s) {
        for (Student st : dsSinhVien) {
            if (st.getMssv().equalsIgnoreCase(s.getMssv())) {
                throw new IllegalArgumentException("MSSV " + s.getMssv() + " đã tồn tại trong lớp!");
            }
        }
        dsSinhVien.add(s);
    }

    public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void inBangDiem() {
        System.out.println("=== BẢNG ĐIỂM LỚP: " + tenLop + " ===");
        for (Student s : dsSinhVien) {
            System.out.printf("MSSV: %s | Tên: %s | ĐTB: %.2f | Xếp loại: %s\n",
                    s.getMssv(), s.getName(), s.diemTrungBinh(), xepLoai(s));
        }
        System.out.println("Sĩ số lớp: " + dsSinhVien.size());
    }
}