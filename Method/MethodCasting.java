package Method;

public class MethodCasting {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); <- 매개변수와 인수의 Type이 다름.
        printNumber((int) number); // 명시적 형변환 이용
    }
    public static void printNumber(int n){
        System.out.println(n);
    }
}
