public class HybridCar extends Car{
    
    private int batteryCapacity;

    public HybridCar(){

    }

    public HybridCar(String plateNum, String manufacturer, int noOfPassenger, int batteryCapacity, double x1, double y1, double x2, double y2){
        super(plateNum, manufacturer, noOfPassenger, x1, y1, x2, y2);
        this.batteryCapacity = batteryCapacity;
        
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    @Override
    public void describe(){
        System.out.println("plateNum: " + getPlateNum());
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("number of passenger: " + getNoOfPassenger());
        System.out.println("battery capacity: " + getBatteryCapacity());
        System.out.println("start coord: " + getX1() + ", " + getY1());
        System.out.println("last coord: " + getX2() + ", " + getY2());
        System.out.println("fuel for 100km: " + getFuelFor100km());
        System.out.printf("distance: %.2f km\n", findDistance());
        System.out.printf("required fuel: %.1f L\n\n", findRequiredFuel());
    }
}
