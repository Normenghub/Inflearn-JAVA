package oop;

public class OopEX1ToObject {
    public static void main(String[] args) {
        OopEX1Data data = new OopEX1Data();

        data.height = 9;
        data.width = 5;

        System.out.println("넓이 = " + data.calculateArea());

        System.out.println("둘레 = " + data.calculatePerimeter());

        System.out.println("정사각형 여부 = " + data.isSquare());
    }
}
