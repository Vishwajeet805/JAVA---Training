package MethodOverloading;

class Book {
    void Display(String Title,String Author){
        System.out.println("Title :"+Title);
        System.out.println("Author :"+Author);
    }
    void Display(String Title,String Author,int Price){
        System.out.println("Title :"+Title);
        System.out.println("Author :"+Author);
        System.out.println("Price :"+Price);
    }

    static void main() {
        Book m=new Book();
        m.Display("Anabella","TAtiya Bichu");
        m.Display("Meri Aankhein","Andha,",99);
    }
}

