package S201;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("##1.Trying to catch EmptySaleException for an empty sell");
        Sell firstSell = new Sell();

        try{
            firstSell.totalPriceCalculation();
        }catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=====");
        System.out.println("##2.Saving and showing totalPriceCalculation method");

        Product firstProduct = new Product("Phone",800);
        Product secondProduct = new Product("Television",1000);

        firstSell.addProduct(firstProduct);
        firstSell.addProduct(secondProduct);

        try {
            System.out.println("The total price of the selling is " + firstSell.totalPriceCalculation());
        }catch (EmptySaleException e){
            System.out.println("Unexpected error");
        }

        System.out.println("=====");
        System.out.println("##3.Trying to catch IndexOutOfBoundsException in a Products List");

        try{
            List<Product> productsList = new ArrayList<>();
            productsList.add(firstProduct);
            productsList.get(2);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
