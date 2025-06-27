package Inheritance;


class Plane {
    void takeOff() {
        System.out.println("Plane is taking-off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}
class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("CargoPlane flies at lower heights");
    }
    void carryCargo() {
        System.out.println("CargoPlane carries cargo ");
    }
}
class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
    void carryPassenger() {
        System.out.println("PassengerPlane carries people");
    }
}
class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("FighterPlane flies at any height");
    }
    void carryWeapons() {
        System.out.println("FighterPlane carries weapons");
    }
}







public class Day41 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryCargo();
        System.out.println("========================================");

        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryPassenger();
        System.out.println("==========================================");

        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
    }
}
