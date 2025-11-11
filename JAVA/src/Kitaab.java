class Book{
    String Title;
    String Author;
    int Price;
    void display(){
        System.out.println("Title:"+Title);
        System.out.println("Author:"+Author);
        System.out.println("Price:"+Price);
    }
    void discount(int x){
        System.out.println("Original Amount:"+Price);
        int Discount = (Price* x) / 100;
        System.out.println("Discount Applied:"+x);
        System.out.println("Price:"+ (Price-Discount));
    }
}
public class Kitaab {
    static void main() {
        Book b1=new Book();
        b1.Title="The Naga Warriors";
        b1.Author="Akshat Gupta";
        b1.Price=100;
        b1.discount(10);
        b1.display();
    }
}
