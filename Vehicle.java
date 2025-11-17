public abstract class Vehicle {

    private String plateNum;
    private String manufacturer;
    private double x1, y1, x2, y2;
    private double fuelFor100km;

    public Vehicle(){

    }

    public Vehicle(String plateNum, String manufacturer, double x1, double y1, double x2, double y2){
        this.plateNum = plateNum;
        this.manufacturer = manufacturer;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findDistance(){
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public double findRequiredFuel(){
        return getFuelFor100km() * findDistance() / 100;
    }

    public abstract void describe();


    //setter method
    public void setPlateNum(String plateNum){
        this.plateNum = plateNum;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setX1(double x1){
        this.x1 = x1;
    }

    public void setY1(double y1){
        this.y1 = y1;
    }

    public void setX2(double x2){
        this.x2 = x2;
    }

    public void setY2(double y2){
        this.y2 = y2;
    }

    public void setFuelFor100km(double fuelFor100km){
        this.fuelFor100km = fuelFor100km;
    }


    //getter method
    public String getPlateNum(){
        return this.plateNum;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public double getX1(){
        return this.x1;
    }

    public double getY1(){
        return this.y1;
    }

    public double getX2(){
        return this.x2;
    }

    public double getY2(){
        return this.y2;
    }

    public double getFuelFor100km(){
        return this.fuelFor100km;
    }
}
