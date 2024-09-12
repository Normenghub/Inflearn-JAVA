package poly.Car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("새로운차 시동");
    }

    @Override
    public void stopEngine() {
        System.out.println("새로운차 시동끄기");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("새로운차 악셀밟기");
    }
}
