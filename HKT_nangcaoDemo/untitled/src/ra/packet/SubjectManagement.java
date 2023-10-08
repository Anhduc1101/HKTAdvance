package ra.packet;

import java.util.Scanner;




public class SubjectManagement {
    static Scanner scanner=new Scanner(System.in);
    static Subject[] subjects= new Subject[20];
    static{
        subjects[0]=new Subject("MH355","toán");
        subjects[1]=new Subject("MH333","GDCD");
        subjects[2]=new Subject("MH378","Địa");
    }
    static int index=3;

    public static void main(String[] args) {
        for (int i = 0; i < index; i++) {
            subjects[i].displaySubjectData();
        }

        while (true){
            System.out.println("***** Subject Management *****");
            System.out.println("1. Thêm mới môn học");
            System.out.println("2. Hiển thị danh sách môn học");
            System.out.println("3. Sửa thông tin môn học");
            System.out.println("4. Xóa môn học");
            System.out.println("5. Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                handleAddNewSubject();
                break;
            case 2:
                hanldeDisplayAllSubject();
                break;
            case 3:
                handleEditSubject();
                break;
            case 4:
                handleDeleteSubject();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.exit(1);
                break;

        }
    }

    private static void handleDeleteSubject() {
    }

    private static void handleEditSubject() {

    }

    private static void hanldeDisplayAllSubject() {

    }

    private static void handleAddNewSubject() {
        System.out.println("Nhập môn học mới: ");
            Subject sub=new Subject();
            sub.inputSubjectData();
            subjects[index++]=sub;
    }


}
