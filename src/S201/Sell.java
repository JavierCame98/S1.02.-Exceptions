package S201;

import java.util.ArrayList;
import java.util.List;

public class Sell {
    private List<Product> products;
    private double totalPriceOfSell;

    public Sell(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public double totalPriceCalculation(){
        try {
            if(products.isEmpty()){
                throw new EmptySaleException("The sell is empty");
            }
            double totalPrice = 0;
            for (Product p : products) {
                totalPrice += p.getPrice();
            }
            totalPriceOfSell = totalPrice;

        }catch(EmptySaleException e){
            System.out.println(e.getMessage());
        }
        return totalPriceOfSell;
    }

    public static void checkIndexOutOfBonus (Product testProduct, int index){
        try{
            List<Product> productsList = new ArrayList<>();
            productsList.add(testProduct);
            productsList.get(index);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }


}
