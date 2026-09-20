package college.model;

import college.util.TextUtils;

public class Student extends Person {
    private String name;
    private int mark;

    public Student(String name) {
        this.name = TextUtils.normalizeName(name);
    }

    public void setMark(int mark) throws InvalidStudentDataException {
        if (mark < 0 || mark > 100) {
            throw new InvalidStudentDataException("Mark must be between 0 and 100");
        }
        this.mark = mark;
    }

    public void submitAssignment() {
        System.out.println(name + " submitted assignment");
    }

    @Override
    public void describeRole() {
        System.out.println(name + " is a Student");
    }

    public String toString() {
        return name + " - " + mark;
    }
}