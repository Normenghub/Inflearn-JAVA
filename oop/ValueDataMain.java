package oop;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
    }
    static void add(ValueData data){
        data.value++;
        System.out.println("숫자 증가 value = " + data.value);
    }
}
