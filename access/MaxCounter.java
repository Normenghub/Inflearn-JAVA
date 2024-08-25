package access;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(isMax()){
            System.out.println("최대값을 초과할 수 없습니다.");
        }else{
            count++;
        }
    }

    private boolean isMax(){
        return count + 1 > max;
    }

    public void getCount(){
        System.out.println("count = " + count);
    }
}
