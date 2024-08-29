package static2;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성 블럭처리
    }

    static int sum(int[] arr){
        return Arrays.stream(arr).sum();
    }
    static double average(int[] arr){
            return Arrays.stream(arr).sum() / arr.length;
    }
    static int max(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    static int min(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }
}
