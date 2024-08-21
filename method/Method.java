package method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println();
        System.out.println(add(a,b));
    }
    // add 메서드
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
