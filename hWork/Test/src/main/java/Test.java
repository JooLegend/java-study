public class Test {
    public static void main(String[] args) {
        Bus bus = new Bus(1,2);
        bus.start();
        bus.oil(50);
        bus.bstatus(true);
        bus.oil(10);
        bus.turn(true, bus.gas);

//        Taxi taxi = new Taxi(2,2,"강남역",3);
//        taxi.taxiStatus(false);
//        taxi.status();
//        taxi.start();
    }
}