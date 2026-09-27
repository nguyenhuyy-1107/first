public class Main {
    public static void main(String[] args) {
        System.out.println("--- KIỂM TRA BÀI 1 & BÀI 2 ---");
        Student sv1 = new Student("Lan", 8, 7.5, 9);
        sv1.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678"); // Chuỗi gọi phương thức[cite: 1]

        Student sv2 = new Student("Nam", 9, 8.0, 7);
        Student sv3 = new Student("Hoa", 6, 5.0, 4);

        sv1.setDiemGK(-1);
        sv1.setDiemGK(11);

        System.out.println("MSSV sv1: " + sv1.getMssv()); // B21DCCN001[cite: 1]
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getTotalStudents());

        System.out.println("\n--- KIỂM TRA BÀI 3 ---");
        Classroom classRoom = new Classroom("D21CQCN01");

        classRoom.addStudent(sv1);
        classRoom.addStudent(sv2);
        classRoom.addStudent(sv3);

        try {
            System.out.println("Đang thử thêm trùng sinh viên sv1 vào lớp...");
            classRoom.addStudent(sv1);
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt lỗi thành công: " + e.getMessage());
        }

        System.out.println();
        classRoom.inBangDiem();
    }
}