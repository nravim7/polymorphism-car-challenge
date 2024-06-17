public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Tesla");
//        car.startEngine();
//        car.drive();

//        Car ferrari = Car.selectCar("Ferrari", "Hybrid Car");
//        ferrari.startEngine();
//        ferrari.drive();
//
//        var tesla = Car.selectCar("Tesla", "hybrid");
//        if (tesla instanceof ElectricCar electricCar) {
//            electricCar.electricMotor();
//        } else if (tesla instanceof GasPoweredCar gasPoweredCar) {
//            gasPoweredCar.gasMotor();
//        } else if (tesla instanceof HybridCar hybridCar) {
//            hybridCar.hybridMotor();
//        }

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
