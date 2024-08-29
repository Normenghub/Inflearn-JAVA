package extends1.overriding;

public class ElectricCar extends Car {
    @Override // 부모 클래스 기능을 자식이 서로 재정의하는 것 메소드 오버라이딩
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge(){
        System.out.println("충전합니다.");
    }
}
