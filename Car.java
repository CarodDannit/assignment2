public class Car extends Vehicle{
    
    private int noOfPassenger;

    public Car(){

    }

    public Car(String plateNum, String manufacturer, int noOfPassenger, double x1, double y1, double x2, double y2){
        super(plateNum, manufacturer, x1, y1, x2, y2);
        this.noOfPassenger = noOfPassenger;
        
    }

    public void setNoOfPassenger(int noOfPassenger){
        this.noOfPassenger = noOfPassenger;
    }

    public int getNoOfPassenger(){
        return this.noOfPassenger;
    }

    @Override
    public void describe(){
        System.out.println("plateNum: " + getPlateNum());
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("number of passenger: " + getNoOfPassenger());
        System.out.println("start coord: " + getX1() + ", " + getY1());
        System.out.println("last coord: " + getX2() + ", " + getY2());
        System.out.println("fuel for 100km: " + getFuelFor100km());
        System.out.printf("distance: %.2f km\n", findDistance());
        System.out.printf("required fuel: %.1f L\n\n", findRequiredFuel());
    }
}
