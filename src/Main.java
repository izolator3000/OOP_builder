import Apartment.Electrician;
import Apartment.Plumber;

public class Main {
    public static void main(String[] args) {
        Plumber pl = new Plumber();
        Electrician el = new Electrician();

        pl.reset();
        el.reset();

        pl.kitchen(5);
        el.kitchen(123);

        pl.bathroom(true);
        el.bathroom(false);

        pl.secondFloor(true);
        el.secondFloor(true);

        System.out.println(pl.pipesLength());
        System.out.println(el.wiresNumber());
    }
}