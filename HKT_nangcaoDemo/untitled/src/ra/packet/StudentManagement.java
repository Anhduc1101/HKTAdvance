package ra.packet;

import java.util.Scanner;

public class StudentManagement {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Đức", "11/01/1994", "Hà Nội", true, "0966633894");
        students[1] = new Student(2, "Anh", "21/02/1997", "Hà Nam", true, "0966633893");
        students[2] = new Student(3, "Chung", "01/03/1999", "Hà Tĩnh", true, "0966633892");
    }

    static int index = 3;

    public static void main(String[] args) {
        for (int i = 0; i < index; i++) {
            students[i].displayStudentData();
        }
        while (true) {
            System.out.println("***** Student Management Menu *****");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                handleAddNewStudent();
                break;
            case 2:
                hanldeDisplayAllStudents();
                break;
            case 3:
                handleEditStudentInfo();
                break;
            case 4:
                handleDeleteStudent();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.exit(1);
                break;

        }
    }

    private static void handleDeleteStudent() {
        System.out.println("Nhập mã sinh viên bạn muốn xóa: ");
        int deleteId= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            if(students[i].getStudentId()==deleteId){
                for (int j=0;j<index;j++){
                    students[j]=students[j+1];
                }
            }
            index--;
            return;
        }
    }

    private static void handleEditStudentInfo() {
        System.out.println("Nhập mã học sinh bạn muốn sửa: ");
        int inputId= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            if(students[i].getStudentId()==inputId){
                students[i].displayStudentData();
                students[i].inputData();
            }
        return;
        }
    }

    private static void hanldeDisplayAllStudents() {
        for (int i = 0; i < index; i++) {
            students[i].displayStudentData();
        }
    }

    private static void handleAddNewStudent() {
        Student stu = new Student();
        stu.inputData();
        students[index++] = stu;
    }
}
