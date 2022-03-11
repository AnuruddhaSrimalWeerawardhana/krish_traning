public class Application {

    public static void main(String[] arg){

        Registry registry  = new Registry();

        Car car = (Car) registry.getVehicle(VehicleType.Car);
        System.out.println(car);

        car.setType("lux");

        System.out.println(car);

        Car car1 = (Car) registry.getVehicle(VehicleType.Car);
        System.out.println(car1);
    }
}
