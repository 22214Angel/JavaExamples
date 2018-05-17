public class Vehicle {
    private String brandName;
    private float speed;
    private float fuelTankCapacity;
    private float price;

    static final float MIN_ANGLE_OF_TURNING = 0, MAX_ANGLE_OF_TURNING = 180,
            ANGLE_FOR_STRAIGHT_DIRECTION = 90;

    public Vehicle(String brandName, float speed, float fuelTankCapacity, float price) {
        this.brandName = brandName;
        this.speed = speed;
        this.fuelTankCapacity = fuelTankCapacity;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(float fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

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
