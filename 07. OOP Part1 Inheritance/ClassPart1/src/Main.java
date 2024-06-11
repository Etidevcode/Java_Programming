public class Main {

    public static void main(String[] args) {

        Car car  = new Car();
        // car.make = "Porsche";
        // car.model="Carrera";
        // car.color = "Red";
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        car.setMake("Maserati");
        car.setModel("Targa");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("red");
        targa.describeCar();
    }
}
