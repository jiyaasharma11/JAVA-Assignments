package college.model;

public class Instructor extends Person {
    public void conductClass() {
        System.out.println("Instructor is conducting class");
    }

    @Override
    public void describeRole() {
        System.out.println("Instructor");
    }
}