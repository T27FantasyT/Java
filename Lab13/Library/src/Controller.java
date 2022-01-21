import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static ArrayList<Knowledge> list = service.getAllData();
    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("-----------------------");
        System.out.println("1 - Xem danh sách theo từng thể loại");
        System.out.println("2 - Tìm tài liệu theo tên");
        System.out.println("3 - Kiểm tra ebook có lượt tải nhiều nhất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn");
    }

    public static void mainMenu(){
        boolean isContinue = true;
        while (isContinue){
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Danh sách thể loại tài liệu có trong thư viện");
                    service.getALlType(list);
                    System.out.println("Nhập thể loại muốn kiểm tra");
                    String type = sc.nextLine();
                    service.searchByType(list,type);
                    break;
                case 2:
                    System.out.println("Nhập tên tài liệu muốn tìm kiếm");
                    String name = sc.nextLine();
                    service.searchByName(list,name);
                    break;
                case 3:
                    service.highestDownloadDocument(list);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("");
            }
        }
    }
}
