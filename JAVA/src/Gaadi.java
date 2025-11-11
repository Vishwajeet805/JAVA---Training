class Car {
    String brand;
    int price;
    String model;
    void display(){
        System.out.println("Car Brand:"+brand);
        System.out.println("Car Model:"+ model);
        System.out.println("Car Price:"+ price);
    }
}
class Gaadi{
    static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Fortuner";
        c1.price = 4200000;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.model = "Creta";
        c2.price = 1500000;

        Car c3 = new Car();
        c3.brand = "Tata";
        c3.model = "Nexon";
        c3.price = 1200000;

        Car c4 = new Car();
        c4.brand = "Mahindra";
        c4.model = "XUV700";
        c4.price = 2000000;

        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}

