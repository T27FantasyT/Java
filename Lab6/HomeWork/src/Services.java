import java.util.Scanner;

public class Services {
    public Product createProductInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đơn vị tính: ");
        String calculationUnit = sc.nextLine();
        System.out.println("Nhập giá nhập: ");
        long costPrice = sc.nextLong();
        System.out.println("Nhập giá bán: ");
        long sellPrice = sc.nextLong();
        System.out.println("Nhập số lượng bán: ");
        int sellQuantity = sc.nextInt();

        Product products = new Product(id,name,quantity,calculationUnit,costPrice,sellPrice,sellQuantity);
        return products;
    }

    public Product[] show(Product[] arr){
        for(Product p : arr){
            System.out.println(p + " " + ", profit="+profit(p.costPrice,p.sellPrice,p.sellQuantity)+".");
        }
        return arr;
    }
    public Product[] addProductInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm: ");
        int size = sc.nextInt();
        Product[] products = new Product[size];
        for(int i =0 ; i<size; i++){
            products[i] = createProductInfo();
        }
        return products;
    }
    public long profit(long costPrice, long sellPrice, int sellQuantity){
        return (sellPrice-costPrice)*sellQuantity;
    }
}