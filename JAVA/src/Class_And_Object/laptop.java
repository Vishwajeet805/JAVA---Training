package Class_And_Object;
class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------");
    }


    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 8, 55000);
        Laptop l2 = new Laptop("Dell", 16, 72000);

        l1.display();
        l2.display();
    }
}