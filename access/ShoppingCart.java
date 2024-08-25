package access;

public class ShoppingCart {
    private Item[] list = new Item[10];
    private int index = 0;
    private int sumPrice = 0;

    public void addItem(Item item){
        if(isTen()){
            list[index++] = item;
            sumPrice += item.getSum();
        }else{
            System.out.println("장바구니 초과");
        }
    }

    private boolean isTen(){
        if(index == 10){
            return false;
        }else{
            return true;
        }
    }

    public void displayItems(){
        for(int i = 0; i < index; i++){
            System.out.println("상품명 : " + list[i].getItemName() + " 합계 : " + list[i].getSum());
        }
    }

    public void displayTotalPrice(){
        System.out.println("총 가격은 : " + sumPrice);
    }

}
