class Course {
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;

    public Course(String courseCode, String title, int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        enrolledCount = 0;
    }

    public boolean enroll() {
        if (isFull()) {
            return false;
        }

        enrolledCount++;
        return true;
    }

    public boolean withdraw() {
        if (enrolledCount == 0) {
            return false;
        }

        enrolledCount--;
        return true;
    }

    public boolean isFull() {
        return enrolledCount == capacity;
    }

    public int getAvailableSeats() {
        return capacity - enrolledCount;
    }

    public String toString() {
        return courseCode + " - " + title +
               ", Enrolled: " + enrolledCount +
               ", Available: " + getAvailableSeats();
    }
}

public class CourseEnrollment {
    public static void main(String[] args) {
        Course c = new Course("CS101", "Java Programming", 2);

        System.out.println(c);

        System.out.println("Withdraw empty: " + c.withdraw());

        System.out.println("Enroll: " + c.enroll());
        System.out.println(c);

        System.out.println("Enroll: " + c.enroll());
        System.out.println(c);

        System.out.println("Enroll when full: " + c.enroll());

        System.out.println("Withdraw: " + c.withdraw());
        System.out.println(c);

        System.out.println("Withdraw: " + c.withdraw());
        System.out.println(c);
    }
}