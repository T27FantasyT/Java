package service;

import model.Product;
import model.Type;

import java.util.ArrayList;

public class Service {

    public ArrayList<Product> getProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Chổi",100000,3, Type.HOUSEWARES,1));
        products.add(new Product(2,"Thịt bò",200000,5,Type.FOOD,2));
        products.add(new Product(3,"Áo khoác",500000,10,Type.FASHION,4));
        return products;
    }

    public void searchByName(ArrayList<Product> products, String word){
        for(Product p : products){
            if(p.getName().toLowerCase().contains(word)){
                System.out.println(p);
            }
        }
    }

    public void arrayListPrint(ArrayList<Product> products){
        for(Product p : products){
            System.out.println(p);
        }
    }

    public void softByType(ArrayList<Product> products, Type type){

    }



}
