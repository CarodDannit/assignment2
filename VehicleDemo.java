public class VehicleDemo {
    public static void main(String[] args) {
        Car Aruz = new Car("MMM 6055", "Perodua", 7, 50, 350, 89, 15);

        Aruz.setFuelFor100km(4.5);
        Aruz.describe();
    }
}
