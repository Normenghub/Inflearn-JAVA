package Method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(18);
    }
    public static void checkAge(int age) {
        if (age <= 18) {
            System.out.println("미성년자");
            return;
        }
        System.out.println("성인");
    }
}
