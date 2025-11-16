public class Vehicle {

    private String plateNum;
    private String manufacturer;
    private int x1, y1, x2, y2;
    private double fuelFor100km;

    public Vehicle(){

    }

    public Vehicle(String plateNum, String manufacturer, int x1, int y1, int x2, int y2){
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
        return getFuelFor100km() * findDistance();
    }

    public void describe(){}


    //setter method
    public void setPlateNum(String plateNum){
        this.plateNum = plateNum;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setX1(int x1){
        this.x1 = x1;
    }

    public void setY1(int y1){
        this.y1 = y1;
    }

    public void setX2(int x2){
        this.x2 = x2;
    }

    public void setY2(int y2){
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

    public int getX1(){
        return this.x1;
    }

    public int getY1(){
        return this.y1;
    }

    public int getX2(){
        return this.x2;
    }

    public int getY2(){
        return this.y2;
    }

    public double getFuelFor100km(){
        return this.fuelFor100km;
    }
}