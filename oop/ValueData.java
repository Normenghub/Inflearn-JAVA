package oop;

public class ValueData {
    int value;

    void add(){
        value++; // new 객체 생성수 add 메서드 호출시 특정 인스턴스의 멤버변수의 값을 증가시킴
        System.out.println("숫자 증가 value = " + value);
    }
}
