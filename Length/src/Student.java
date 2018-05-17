public class Student {
    private String name;

    public boolean compareLength(double inches1, double inches2) {
        return inches1 == inches2;
    }

    public static double addLengthsInInches(double inches1, double inches2) {
        return inches1 + inches2;
    }

    public static void main(String[] args) {
        Unit feet = new Feet(1);
        Unit inches = new Inches(12);
        Student student = new Student();

        System.out.println("Are the given lengths equal? " +
                student.compareLength(feet.convertGivenValueToInches(), inches.convertGivenValueToInches()));

        System.out.println(addLengthsInInches(feet.convertGivenValueToInches(), inches.convertGivenValueToInches()));
    }
}
