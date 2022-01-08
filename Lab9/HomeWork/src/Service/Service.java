package Service;

import model.Product;
import model.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    static Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Chổi", 100000l, 100, Type.HOUSEWARES, 30));
        products.add(new Product(2, "Thịt bò", 300000l, 20, Type.FOOD, 10));
        products.add(new Product(3, "Áo khoác", 800000l, 50, Type.FASHION, 5));

        return products;
    }

    public void searchByName(ArrayList<Product> products, String word) {
        int count = 0;
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(word.toLowerCase())) {
                count++;
                System.out.println(p);
            }
        }
        if(count==0){
            System.out.println("Mặt hàng này không có trong danh sách: ");
        }
    }

    public void searchByType(ArrayList<Product> products) {
        System.out.println("Nhập loại mặt hàng cần tìm kiếm:");
        System.out.println("1 - Đồ gia dụng \n2 - Thực phẩm \n3 - Thời trang");
        int choose = sc.nextInt();
        boolean isTrue = true;
        int count = 0;
        while (isTrue) {
            switch (choose) {
                case 1:
                    for(Product p : products){
                        if(p.getType() == Type.HOUSEWARES){
                            count++;
                            System.out.println(p);
                        }

                    }
                    if(count ==0){
                        System.out.println("Không có mặt hàng nào thuộc mặt hàng gia dụng");
                    }
                    isTrue = false;
                    break;
                case 2:
                    for (Product p : products) {
                        if (p.getType() == Type.FOOD) {
                            count++;
                            System.out.println(p);
                        }
                    }
                    if (count ==0){
                        System.out.println("Không có sản phẩm nào thuộc mặt hàng Thực phẩm");
                    }
                    isTrue = false;
                    break;
                case 3:
                    for (Product p : products) {
                        if (p.getType() == Type.FASHION) {
                            count++;
                            System.out.println(p);
                        }
                    }
                    if(count==0){
                        System.out.println("Không có sản phẩm nào thuộc mặt hàng Thời trang");
                    }
                    isTrue = false;
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
                    break;
            }
        }
    }

    public Product addProduct() {
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá bán sản phẩm: ");
        long sellPrice = sc.nextLong();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = sc.nextInt();
        System.out.println("1 - Đồ gia dụng \n2 - Thực phẩm \n3 - Thời trang");
        boolean istrue = true;
        Type type = null;
        while (istrue) {
            System.out.println("Chọn loại mặt hàng: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    type = Type.HOUSEWARES;
                    istrue = false;
                    break;
                case 2:
                    type = Type.FOOD;
                    istrue = false;
                    break;
                case 3:
                    type = Type.FASHION;
                    istrue = false;
                    break;
                default:
                    System.out.println("Không có mặt hàng này, xin mời lựa chọn lại: ");
                    break;
            }
        }
        System.out.println("Nhập số lượng bán: ");
        int sellQuantity = sc.nextInt();

        return new Product(id, name, sellPrice, quantity, type, sellQuantity);
    }

    public void deleteProduct(ArrayList<Product> products, int id) {
        products.removeIf(p -> p.getId() == id);

    }

    public void showProduct(ArrayList<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void changeName(ArrayList<Product> products){
        System.out.println("Nhập id sản phẩm cần đổi tên: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên mới của sản phẩm: ");
        String newName = sc.nextLine();
        for(Product p : products){
            if(p.getId()==id){
                p.setName(newName);
                System.out.println("Sản phẩmm sau khi đổi tên: " + p);
            }
        }
    }

    public void changePrice(ArrayList<Product> products){
        System.out.println("Nhập id sản phẩm cần cập nhật giá: ");
        int id = sc.nextInt();
        System.out.println("Nhập giá mới của sản phẩm: ");
        long newPrice = sc.nextLong();
        for (Product p : products){
            if(p.getId()==id) {
                p.setSellPrice(newPrice);
                System.out.println("Sản phẩm sau khi cập nhật giá: " + p);
            }

        }
    }


}
