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
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
