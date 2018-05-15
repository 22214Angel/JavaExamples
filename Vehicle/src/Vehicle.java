public class Vehicle {
    String brandName;
    float speed;
    float fuelTankCapacity;
    float price;

    static final float MIN_ANGLE_OF_TURNING = 0, MAX_ANGLE_OF_TURNING = 180,
            ANGLE_FOR_STRAIGHT_DIRECTION = 90;

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.accelerate();
        vehicle.decelerate();
        vehicle.steer(30);
    }

    private void applyBrakes() {
        while(speed != 0) {
            decelerate();
        }
        System.out.println("Stopped!");
    }

    private void decelerate() {
        System.out.println("Decreasing speed! " + --speed);
    }

    private void accelerate() {
        System.out.println("Inceasing speed! " + ++speed);
    }

    private void steer(float angleOfTurning) {
        if (angleOfTurning < ANGLE_FOR_STRAIGHT_DIRECTION)
            System.out.println("Turning right !");
        else if (angleOfTurning > ANGLE_FOR_STRAIGHT_DIRECTION)
            System.out.println("Turning left !");
        else
            System.out.println("Going straight !");
    }
}
