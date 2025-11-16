public class Truck extends Vehicle{
    
    private int loadCapacity;

    public Truck(){

    }

    public Truck(String plateNum, String manufacturer, int loadCapacity, int x1, int y1, int x2, int y2){
        this.setPlateNum(plateNum);
        this.setManufacturer(manufacturer);
        this.loadCapacity = loadCapacity;
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);

    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity(){
        return this.loadCapacity;
    }

    public void describe(){
        System.out.println("plateNum: " + getPlateNum());
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("load capacity: " + getLoadCapacity());
        System.out.println("start coord: " + getX1() + ", " + getY1());
        System.out.println("last coord: " + getX2() + ", " + getY2());
        System.out.printf("distance: %.2f km\n", findDistance());
        System.out.printf("required fuel: %.2f L\n\n", findRequiredFuel());
    }
}
