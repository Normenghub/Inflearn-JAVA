package Method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int num = 100;
        printNumber(num);
    }
    public static void printNumber(double num){
        System.out.println(num); // 자동 형변환 적용.
    }
}
