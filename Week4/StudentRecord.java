class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Invalid student ID");
        }

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark");
        }

        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100) {
            return false;
        }

        mark = newMark;
        return true;
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public String getClassification() {
        if (mark >= 80)
            return "Distinction";
        else if (mark >= 50)
            return "Pass";
        else
            return "Fail";
    }

    public String toString() {
        return name + " (" + studentId + ") - " + mark + " - " + getClassification();
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "S001", 49);
        Student s2 = new Student("Bob", "S002", 50);
        Student s3 = new Student("Charlie", "S003", 79);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.setMark(80);
        s2.setMark(79);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Invalid update: " + s3.setMark(101));
        System.out.println(s3);
    }
}