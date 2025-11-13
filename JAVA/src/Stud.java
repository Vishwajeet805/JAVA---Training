class Person {
    void Name() {
        System.out.println("Name: Aryan");
    }
}
class Students extends Person {
    void Class() {
        System.out.println("Class: 12th");
    }
}
class Monitor extends Students {
    void Discipline() {
        System.out.println("Monitor is checking discipline");
    }}

  class Stud {
             static void main(String[] args) {
            Monitor mon = new Monitor();
            mon.Name();
            mon.Class();
            mon.Discipline();
        }
    }


