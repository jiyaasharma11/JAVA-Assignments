class Person {
    String name;
    Person(String name) { this.name = name; }
    void showInfo() {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    int id;
    Student(String name, int id) {
        super(name);
        this.id = id;
    }
    void showInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}

class Professor extends Person {
    String dept;
    Professor(String name, String dept) {
        super(name);
        this.dept = dept;
    }
    void showInfo() {
        System.out.println("Prof: " + name + ", Dept: " + dept);
    }
}

class CampusRegistry {
    Person[] list = new Person[2];
    int count = 0;

    void add(Person p) {
        list[count++] = p;
    }

    void process() {
        for (Person p : list) {
            p.showInfo();
        }
    }
}

public class CampusManagementApp {
    public static void main(String[] args) {
        CampusRegistry reg = new CampusRegistry();
        reg.add(new Student("Alex", 101));
        reg.add(new Professor("Dr. Smith", "CS"));
        reg.process();
    }
}