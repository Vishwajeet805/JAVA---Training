
  abstract class  Animals{
        void eat(){
            System.out.println("burger");
        }
        void attack(){
            System.out.println("BHaag");
        }
        static void staticp(){
            System.out.println("kanim");
        }
    }
    class Dogs extends Animals {
        void eat(){
            System.out.println("dog_food");
        }
        void sleep(){
            System.out.println("NINININI");
        }
        static void staticp(){
            System.out.println("jnn");
        }

    }
    class UpDownCasting {
        static void main() {
            Animals a = new Dogs();
            a.eat();
            a.staticp();
            Dogs s2=(Dogs)a;
            s2.sleep();
            s2.attack();
            s2.eat();
        }
    }


