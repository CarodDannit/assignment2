public class HybridCar extends Car{
    
    private int batteryCapacity;

    public HybridCar(){

    }

    public HybridCar(String plateNum, String manufacturer, int noOfPassenger, int batteryCapacity, int x1, int y1, int x2, int y2){
        this.setPlateNum(plateNum);
        this.setManufacturer(manufacturer);
        this.setNoOfPassenger(noOfPassenger);
        this.batteryCapacity = batteryCapacity;
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public void describe(){
        System.out.println("plateNum: " + getPlateNum());
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("number of passenger: " + getNoOfPassenger());
        System.out.println("battery capacity: " + getBatteryCapacity());
        System.out.println("start coord: " + getX1() + ", " + getY1());
        System.out.println("last coord: " + getX2() + ", " + getY2());
        System.out.printf("distance: %.2f km\n", findDistance());
        System.out.printf("required fuel: %.2f L\n\n", findRequiredFuel());
    }
}
