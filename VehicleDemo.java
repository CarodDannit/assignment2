public class VehicleDemo {
    public static void main(String[] args) {
        // question A
        Car Aruz = new Car("MMM 6055", "Perodua", 7, 50.1, 350.3, 89.3, 15.2);

        // question B
        System.out.println("===== Aruz =====");
        Aruz.setFuelFor100km(4.5);
        Aruz.describe();
    }
}

