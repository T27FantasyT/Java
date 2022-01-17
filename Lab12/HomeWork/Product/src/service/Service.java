package service;

import model.Product;
import model.Type;

import java.util.ArrayList;

public class Service {

    public ArrayList<Product> getProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Dell-XPS9305","Ultrabook",25000000,10,4,"Dell",new String[] {Type.Laptop.value}));
        products.add(new Product(2,"Iphone 4", "Mobile Phone",3000000,40,5,"Apple",new String[] {Type.Apple.value, Type.Mobile.value}));
        products.add(new Product(3,"Samsung galaxy S20","Mobile Phone",20000000,5,1,"Samsung",new String[] {Type.Mobile.value}));
        products.add(new Product(4,"Macbook cũ","Laptop",7000000,10,1,"Apple",new String[] {Type.Apple.value, Type.Laptop.value}));
        products.add(new Product(5,"Sạc laptop","Sạc laptop",5000000,500,20,"Dell",new String []{Type.Laptop.value, Type.Accessory.value}));
        products.add(new Product(6,"Sạc iphone","Sạc iphone",1000000,40,20,"Apple", new String[] {Type.Accessory.value, Type.Apple.value}));


        return products;
    }

    public void searchByType(ArrayList<Product> products, int choose){
            int count = 0;
            switch (choose){
                case 1 :
                    for(Product p : products){
                        for(int i = 0; i < p.getType().length;i++){
                            if(p.getType()[i].equals(Type.Laptop.value)){
                                System.out.println(p);
                                count++;

                            }
                        }
                    }
                    System.out.println("Danh mục Laptop có: " + count + " sản phẩm");
                    break;
                case 2 :
                    for(Product p : products){
                        for(int i = 0; i < p.getType().length;i++){
                            if(p.getType()[i].equals(Type.Mobile.value)){
                                System.out.println(p);
                                count++;
                            }
                        }
                    }
                    System.out.println("Danh mục Điện thoại có: " + count + " sản phẩm");
                    break;
                case 3:
                    for(Product p : products){
                        for(int i = 0; i < p.getType().length;i++){
                            if(p.getType()[i].equals(Type.Apple.value)){
                                System.out.println(p);
                                count++;
                            }
                        }
                    }
                    System.out.println("Danh mục Apple có: " + count + " sản phẩm");
                    break;
                case 4:
                    for(Product p : products){
                        for(int i = 0; i < p.getType().length;i++){
                            if(p.getType()[i].equals(Type.Accessory.value)){
                                System.out.println(p);
                                count++;
                            }
                        }
                    }
                    System.out.println("Danh mục Phụ kiện có: " + count + " sản phẩm");
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    public void getManufature(ArrayList<Product> products){
        ArrayList<String> manufature = new ArrayList<>();
        for(Product p : products){
            if(!manufature.contains(p.getManufacture())){
                manufature.add(p.getManufacture());
            }
        }

        for(String s : manufature){
            System.out.println(s);
        }

    }


    public void searchByManufacture(ArrayList<Product> products, String word){
        for (Product p : products){
            if(p.getManufacture().equalsIgnoreCase(word)){
                System.out.println(p);

            }
        }
    }

    public void searchByPrice(ArrayList<Product> products, int choose){
        for(Product p : products){
            switch (choose){
                case 1:
                    if(p.getPrice()<2000000){
                        System.out.println(p);
                    }
                    break;
                case 2:
                    if(p.getPrice()>= 2000000 && p.getPrice()<4000000){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    if(p.getPrice()>= 4000000 && p.getPrice()<7000000){
                        System.out.println(p);
                    }
                    break;
                case 4:
                    if(p.getPrice()>= 7000000 && p.getPrice()<13000000){
                        System.out.println(p);
                    }
                    break;
                case 5:
                    if(p.getPrice()>= 13000000){
                        System.out.println(p);
                    }
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }

        }
    }

    public void searchByName(ArrayList<Product> products, String name){
        int count = 0;
        for(Product p : products){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
                count++;
            }

        }
        if(count == 0){
            System.out.println("Không có sản phẩm này");
        }
    }





}
