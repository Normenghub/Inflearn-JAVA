package ClassAndDatas;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        ProductOrder product2 = new ProductOrder();
        ProductOrder product3 = new ProductOrder();
        product1.productName = "두부";
        product2.productName = "김치";
        product3.productName = "콜라";
        product1.price = 2000;
        product2.price = 5000;
        product3.price = 1500;
        product1.quantity = 2;
        product2.quantity = 1;
        product3.quantity = 2;
        int sumPrice = product1.price * product1.quantity + product2.price* product2.quantity + product3.price* product3.quantity;
        ProductOrder[] products = {product1, product2, product3};

        for(ProductOrder product: products){
            System.out.println("상품명: " + product.productName + " 가격: " + product.price + " 수량: " + product.quantity);

        }
        System.out.println("총 결제 금액: " + sumPrice);

    }
}
