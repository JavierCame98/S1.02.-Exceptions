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

    public double totalPriceCalculation() throws EmptySaleException{
        if(products.isEmpty()){
            throw new EmptySaleException("For a sale first you have to make products");
        }
        double totalPrice = 0;
        for(Product p : products){
            totalPrice += p.getPrice();
        }
        totalPriceOfSell = totalPrice;
        return totalPriceOfSell;
    }




}
