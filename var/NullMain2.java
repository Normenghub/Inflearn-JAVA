package var;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 12;
        System.out.println("data value: " + data.value);
    }
}
