import java.util.Scanner;
import java.lang.*;

public class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price){
        this.productId=productId;
        this.productName= productName;
        this.price= price;
    }

    public void show(){
        System.out.println("ProductId:"+ productId);
        System.out.println("ProductName:"+ productName);
        System.out.println("Price:"+ price);
    }

    public static void main(String[] args) {
        Product p = new Product(005, "Charger", 450);
        p.show();
    }
}
