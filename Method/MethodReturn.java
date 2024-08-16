package Method;

public class MethodReturn {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }
}
