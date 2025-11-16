package Inheritance;
class Person {
    void Name() {
        System.out.println("Name: Shourya");
    }
}
class Students extends Person {
    void Class() {
        System.out.println("Class: 3rd Sem");
    }
}
class Monitor extends Students {
    void Discipline() {
        System.out.println("Monitor is my disciple");
    }}

  class Stud {
             static void main(String[] args) {
            Monitor mon = new Monitor();
            mon.Name();
            mon.Class();
            mon.Discipline();
        }
    }


