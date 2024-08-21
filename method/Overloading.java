package method;
// 같은 메소드 이름 사용가능 매개변수의 갯수 또는 타입이 달라야함
public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        myMethod(1.2,1);
        myMethod(1,1.2);
        System.out.println(add2(1,2));
        System.out.println(add2(1.2,1.3));
    }
    public static int add(int a, int b) {
        System.out.println("1번");
        return a+b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("2번");
        return a + b + c;
        }
    public static void myMethod(int a, double b){
        System.out.println("int a double b");
    }
    public static void myMethod(double a , int b){
        System.out.println("double a int b");
    }
    public static int add2(int a, int b) {
        return a+b;
    }
    public static double add2(double a, double b) {
        return a + b;
    }
}
