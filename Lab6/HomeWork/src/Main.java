public class Main{
    public static void main(String[] args) {

        Services services = new Services();
        Product[] products = services.addProductInfo();
        services.show(products);

    }
}