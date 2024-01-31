package Apartment;

public class Plumber implements Apartment{

    String pipes = "";

    @Override
    public void reset() {
        this.pipes = "";
    }

    @Override
    public void kitchen(int area) {
        this.pipes = this.pipes + Integer.toString(area) + " ";
    }

    @Override
    public void bathroom(boolean jacuzzi) {
        this.pipes = this.pipes + " jacuzzi ";
    }

    @Override
    public void secondFloor(boolean secondFloor) {
        this.pipes = this.pipes + " secondFloor ";
    }

    public String pipesLength(){
        return this.pipes;
    }
}
