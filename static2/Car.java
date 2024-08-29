package static2;

public class Car {
    private static int carCounter;
    private String carName;

    public Car(String carName){
        System.out.println("차량 구입, 이름 : " + carName);
        this.carName = carName;
        carCounter++;
    }

    static void showTotalCars(){
        System.out.println(carCounter);
    }
}
