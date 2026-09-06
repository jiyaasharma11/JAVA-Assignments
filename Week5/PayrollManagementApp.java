interface Payable {
    double getPay();
}

class FullTimeEmployee implements Payable {
    double salary;
    FullTimeEmployee(double salary) { this.salary = salary; }
    public double getPay() { return salary; }
}

class Contractor implements Payable {
    double rate;
    int hours;
    Contractor(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }
    public double getPay() { return rate * hours; }
}

class PayrollProcessor {
    Payable[] items = new Payable[2];
    int count = 0;

    void add(Payable p) {
        items[count++] = p;
    }

    double getTotal() {
        double total = 0;
        for (Payable p : items) {
            total += p.getPay();
        }
        return total;
    }
}

public class PayrollManagementApp {
    public static void main(String[] args) {
        PayrollProcessor proc = new PayrollProcessor();
        proc.add(new FullTimeEmployee(5000.0));
        proc.add(new Contractor(50.0, 40));
        System.out.println("Total: " + proc.getTotal());
    }
}