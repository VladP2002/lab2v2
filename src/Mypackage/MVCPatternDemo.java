package Mypackage;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Car model  = retriveCarFromDatabase();

        //Create a view : to write Car details on console
        CarView view = new CarView();

        CarController controller = new CarController(model, view);

        controller.updateView();

        //update model data
        controller.setcarMark("Mitsubishi");
        controller.setCarConstrYear(2003);
        controller.setCarColour("Red");
        System.out.println("\nAfter updating, Car Details are as follows");

        controller.updateView();
    }

    private static Car retriveCarFromDatabase(){
        Car car = new Car();
        car.setcarMark("BMW");
        car.setCarConstrYear(2009);
        car.setCarColour("Blue");

        return car;
    }
}