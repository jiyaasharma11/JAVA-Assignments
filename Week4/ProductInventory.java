class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    public Product(String code, String name, double unitPrice, int quantity) {
        if (unitPrice <= 0 || quantity < 0) {
            throw new IllegalArgumentException("Invalid product details");
        }

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCount++;
    }

    public boolean restock(int amount) {
        if (amount <= 0) {
            return false;
        }

        quantity += amount;
        return true;
    }

    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }

        quantity -= amount;
        return true;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return code + " - " + name +
               ", Price: " + unitPrice +
               ", Quantity: " + quantity +
               ", Value: " + getInventoryValue();
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Pen", 10);
        Product p2 = new Product("P002", "Book", 50, 5);
        Product p3 = new Product("P003", "Bag", 500, 2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.restock(10);
        p2.sell(2);

        System.out.println("\nAfter changes:");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nTotal products: " + Product.getProductCount());
    }
}