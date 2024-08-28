package Oops_Abstraction;

public class Car_Abstraction_access {
    public void brake() {
        System.out.println("Brake is Applied to stop the car");
    }

    public void gear() {
        System.out.println("Level up the speed from 1 to 5 ");
    }

    public void engine() {
        System.out.println("Rotated to drive the car and automatically get lubricated");
    }
    public static void main(String[] args)
    {
        Car_Abstraction_access ca=new Car_Abstraction_access();
        ca.brake();
        ca.engine();
        ca.gear();
    }
}
