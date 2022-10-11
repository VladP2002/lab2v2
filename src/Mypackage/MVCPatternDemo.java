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

        System.out.println("\n");

        Car car2 = new Car();
        car2.setcarMark("Audi");
        car2.setCarConstrYear(2015);
        car2.setCarColour("Green");

        Car car3 = new Car();
        car3.setcarMark("Tesla");
        car3.setCarConstrYear(2019);
        car3.setCarColour("White");


        Car[] cars = {model, car2, car3};
        Car carFromArray = new Car();
        carFromArray.setcarMark(cars[0].getcarMark());
        carFromArray.setCarConstrYear(cars[1].getCarConstrYear());
        carFromArray.setCarColour(cars[2].getCarColour());

        view.printCarDetails(carFromArray.getcarMark(),carFromArray.getCarConstrYear(),carFromArray.getCarColour());
    }

    private static Car retriveCarFromDatabase(){
        Car car = new Car();
        car.setcarMark("BMW");
        car.setCarConstrYear(2009);
        car.setCarColour("Blue");

        return car;
    }
}