package hol.troll.poll;

public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        wheel.print();
        door.print();

        Distance.Converter converter = new Distance.Converter();
        converter.MToKm(2400);
        converter.KmToM(7);
    }
}
