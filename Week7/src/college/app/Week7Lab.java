package college.app;

import college.model.Student;
import college.model.Person;
import college.model.Instructor;
import college.model.InvalidStudentDataException;
import college.util.TextUtils;

public class Week7Lab {
    public static void main(String[] args) {

        Student s = new Student("  asha   nair ");

        try {
            s.setMark(85);
            System.out.println(s);
        } catch (InvalidStudentDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation attempt complete");
        }

        try {
            int mark = Integer.parseInt("abc");
            s.setMark(mark);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (InvalidStudentDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation attempt complete");
        }

        try {
            s.setMark(120);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (InvalidStudentDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation attempt complete");
        }

        Person[] people = {
            new Student("David"),
            new Instructor()
        };

        for (Person p : people) {
            p.describeRole();

            if (p instanceof Student student) {
                student.submitAssignment();
            }

            if (p instanceof Instructor instructor) {
                instructor.conductClass();
            }
        }

        System.out.println("Normalizations: " + TextUtils.getCount());
    }
}