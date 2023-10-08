package ra.packet;

public class Mark {
    private int markId;
    private Student student;
    private Subject subject;
    private int point;
    private static int count = 0;

    public Mark() {
        this.markId = count++;
    }

    public Mark(int markId, Student student, Subject subject, int point) {
        this.markId = count++;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void inputMarkData(){
        System.out.println("Nhập điểm số (0-10): ");
        while (true){
            if(this.point<0 || this.point>10){
                System.out.println("Nhập điểm sai. Hãy nhập lại: ");
            }else {
                break;
            }
        }
    }


    public void dsplayMarkData() {
        System.out.println( "Mark Info: {" +
                "markId=" + markId +
                ", student=" + student +
                ", subject=" + subject +
                ", point=" + point +
                '}');
    }
}
