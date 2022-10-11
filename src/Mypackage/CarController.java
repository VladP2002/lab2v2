package Mypackage;

public class CarController {
    private Car model;
    private CarView view;

    public CarController(Car model, CarView view) {
        this.model = model;
        this.view = view;
    }

    public void setcarMark(String mark) {
        model.setcarMark(mark);
    }

    public String getcarMark() {
        return model.getcarMark();
    }

    public void setCarConstrYear(int year) {
        model.setCarConstrYear(year);
    }

    public int getCarConstrYear() {
        return model.getCarConstrYear();
    }

    public void setCarColour(String category) {
        model.setCarColour(category);
    }

    public String getCarColour() {
        return model.getCarColour();
    }

    public void updateView() {
        view.printCarDetails(model.getcarMark(), model.getCarConstrYear(), model.getCarColour());
    }
}
