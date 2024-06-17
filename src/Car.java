public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println(description + " engine is starting..");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running..");
    }

    public static Car selectCar(String description, String typeOfCar) {
        return switch (typeOfCar.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };
    }

}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

    public void gasMotor() {
        System.out.println("Gas motor is starting");
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
        this.avgKmPerCharge = 80.5;
        this.batterySize = 20;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric car battery is on and its battery size is " + batterySize);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving the Electric car and it can be drive " + avgKmPerCharge + " per Charge");
    }

    public void electricMotor() {
        System.out.println("Electric motor is starting");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
        this.avgKmPerLitre = 40;
        this.batterySize = 20;
        this.cylinders = 4;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid car engine is starting and its battery size is " + batterySize +
                " and it has " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving the Hybrid car and it can be drive " + avgKmPerLitre + " per litre");
    }

    public void hybridMotor() {
        System.out.println("Hybrid motor is starting");
    }
}
