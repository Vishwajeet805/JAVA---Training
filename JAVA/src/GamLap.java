class Device {
    void PowerOn() {
        System.out.println("Powering On");
    }
}
class Laptops extends Device {
    void Boot() {
        System.out.println("BOOTING");
    }
}
class GamingLaptop extends Laptops {
    void StartGame() {
        System.out.println("Game is Getting Started");
    }
}

class GamLap {
    static void main(String[] args) {
        GamingLaptop mon = new GamingLaptop();
        mon.PowerOn();
        mon.Boot();
        mon.StartGame();
    }
}


