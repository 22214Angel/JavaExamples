class Inches extends Unit {
    public Inches(double value) {
        this.value = value;
    }

    @Override
    public double convertGivenValueToInches() {
        double temp = value;
        System.out.println("value after conversion " + temp);
        return temp;
    }
}

