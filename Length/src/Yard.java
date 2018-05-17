class Yard extends Unit {
    public Yard(double value) {
        this.value = value;
    }

    @Override
    public double convertGivenValueToInches() {
        double temp = value * 0.9144f;
        System.out.println("value after " + temp);
        return temp;
    }

}
