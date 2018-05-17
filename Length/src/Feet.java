public class Feet extends Unit {
    public Feet(double value) {
        this.value = value;
    }

    @Override
    public double convertGivenValueToInches() {
        double temp = value * 12;
        System.out.println("value after " + temp);
        return temp;
    }
}
