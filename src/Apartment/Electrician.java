package Apartment;

import java.util.ArrayList;

public class Electrician implements Apartment{
    ArrayList<Integer> wires = new ArrayList<>();
    Boolean jacuzzi = false, secondFloor = false;

    @java.lang.Override
    public void reset() {
        this.wires = new ArrayList<>();
    }

    @java.lang.Override
    public void kitchen(int area) {
        this.wires.add(area);
    }

    @java.lang.Override
    public void bathroom(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @java.lang.Override
    public void secondFloor(boolean secondFloor) {
        this.secondFloor = secondFloor;
    }

    public int wiresNumber(){
        return this.wires.size() + (secondFloor?1:0) + (jacuzzi?1:0);
    }
}
