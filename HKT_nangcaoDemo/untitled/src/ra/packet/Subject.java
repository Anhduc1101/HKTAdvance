package ra.packet;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Subject {
    private String subjectId;
    private String subjectName = "Văn";

    public Subject() {

    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void inputSubjectData() {
        Scanner scanner = new Scanner(System.in);
        String regexSubjectId = "^MH(?!.*(.).*\\1)\\d{3}$";
        System.out.println("Nhập mã môn học: ");
        boolean validateSubjectId;
        do {
            this.subjectId = scanner.nextLine();
            validateSubjectId = Pattern.matches(regexSubjectId, this.subjectId);
            if (!validateSubjectId) {
                System.out.println("Mã môn học phải bắt đầu bằng ký tự (MH) !");

            }
        } while (!validateSubjectId);


        System.out.println("Nhập tên môn học: ");
        while (true) {
            this.subjectName = scanner.nextLine();
            if (this.subjectName.isEmpty()) {
                System.out.println("Tên môn học không được để trống !");
            } else if (this.subjectName.equals(subjectName)) {
                System.out.println("Môn học này đã được nhập. Hãy nhập tên khác !");
            } else {
                break;
            }
        }
    }


    public void displaySubjectData() {
        System.out.println("Subject Info: {" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}');
    }
}
