package Mypackage;

public class Car {
    private String carMark;
    private int carConstrYear;

    private String carColour;

//    public Car(String carMark, int carConstrYear, String carColour) {
//        this.carMark = carMark;
//        this.carConstrYear = carConstrYear;
//        this.carColour = carColour;
//    }

    public void setcarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getcarMark() {
        return this.carMark;
    }

    public void setCarConstrYear(int constrYear) {
        this.carConstrYear = constrYear;
    }

    public int getCarConstrYear() {
        return this.carConstrYear;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarColour() {
        return this.carColour;
    }
}
