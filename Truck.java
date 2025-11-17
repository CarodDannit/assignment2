public class Truck extends Vehicle{
    
    private int loadCapacity;

    public Truck(){

    }

    public Truck(String plateNum, String manufacturer, int loadCapacity, double x1, double y1, double x2, double y2){
        super(plateNum, manufacturer, x1, y1, x2, y2);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity(){
        return this.loadCapacity;
    }

    @Override
    public void describe(){
        System.out.println("plateNum: " + getPlateNum());
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("load capacity: " + getLoadCapacity());
        System.out.println("start coord: " + getX1() + ", " + getY1());
        System.out.println("last coord: " + getX2() + ", " + getY2());
        System.out.println("fuel for 100km: " + getFuelFor100km());
        System.out.printf("distance: %.2f km\n", findDistance());
        System.out.printf("required fuel: %.2f L\n\n", findRequiredFuel());
    }
}
