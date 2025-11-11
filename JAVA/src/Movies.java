class Movie {
    String name;
    double rating;
    int releaseYear;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Release Year: " + releaseYear);

    }
}

public class Movies {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.name = "Inception";
        m1.rating = 8.8;
        m1.releaseYear = 2010;

        Movie m2 = new Movie();
        m2.name = "Tenet";
        m2.rating = 7.4;
        m2.releaseYear = 2020;

        Movie m3 = new Movie();
        m3.name = "Dune";
        m3.rating = 8.0;
        m3.releaseYear = 2021;

        Movie m4 = new Movie();
        m4.name = "Oppenheimer";
        m4.rating = 8.5;
        m4.releaseYear = 2023;

        Movie m5 = new Movie();
        m5.name = "The Batman";
        m5.rating = 7.9;
        m5.releaseYear = 2022;

        System.out.println("Movies released after 2020:");
        if (m1.releaseYear > 2020) m1.display();
        if (m2.releaseYear > 2020) m2.display();
        if (m3.releaseYear > 2020) m3.display();
        if (m4.releaseYear > 2020) m4.display();
        if (m5.releaseYear > 2020) m5.display();

        }
    }