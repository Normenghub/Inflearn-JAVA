package ClassAndDatas;

public class ProductOrderMain {
    public static void main(String[] args) {
       ProductOrder[] orders = new ProductOrder[3];
       orders[0] = createProductOrder("두부",2000,2);
       orders[1] = createProductOrder("김치",5000,1);
       orders[2] = createProductOrder("콜라",1500,2);

       printOrders(orders);

        System.out.println("총 결제 금액 : " + getTotalAmount(orders));

    }
    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for(ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);

        }

    }
    static int getTotalAmount(ProductOrder[] orders) {
        int amount = 0;
        for(ProductOrder order : orders) {
            amount += order.price * order.quantity;
        }
        return amount;
    }
}
