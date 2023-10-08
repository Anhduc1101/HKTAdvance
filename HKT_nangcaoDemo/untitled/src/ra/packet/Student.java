package ra.packet;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {
    private int studentId;
    private String studentName;
    private String dateOfBirth;
    private String address;
    private boolean gender;
    private String tel;

    private static int count = 0;

    public Student() {
        this.studentId = count++;
    }

    public Student(int studentId, String studentName, String dateOfBirth, String address, boolean gender, String tel) {
        this.studentId = count++;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.tel = tel;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên HS: ");
        while (true) {
            this.studentName = scanner.nextLine();
            if (this.studentName.isEmpty()) {
                System.out.println("Không được để trống !");
            } else {
                break;
            }
        }
        System.out.println("Nhập ngày tháng năm sinh: ");

        this.dateOfBirth = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        while (true) {
            this.address = scanner.nextLine();
            if (this.address.isEmpty()) {
                System.out.println("Không được để trống !");
            } else {
                break;
            }
        }
        System.out.println("Nhập giới tính: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        String regexTel = "^0[0-9]*$";
        System.out.println("Nhập số điện thoại: ");
        boolean validateTel;
        do {
            this.tel = scanner.nextLine();
            validateTel = Pattern.matches(regexTel, this.tel);
            if (!validateTel) {
                System.out.println("Số điện thoại không đúng định dạng. Mời nhập lại");
            }
        } while (!validateTel);
    }

    public void displayStudentData() {
        System.out.println("Student Info :{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                '}');
    }


}
