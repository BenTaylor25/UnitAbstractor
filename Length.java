public class Length {
    private double centimeters;
    private double inches;

    public Length() {
        centimeters = 0;
        inches = 0;
    }

    public double getCm() {
        return centimeters;
    }

    public double getIn() {
        return inches;
    }

    public void setCm(double cm) {
        centimeters = cm;
        inches = cm / 2.54d;
    }

    public void setIn(double in) {
        inches = in;
        centimeters = in * 2.54d;
    }
}
