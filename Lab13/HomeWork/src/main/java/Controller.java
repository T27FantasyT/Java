import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<TextBook> textBooks = service.getAllTextBook();
    static ArrayList<NewsPaper> newsPapers = service.getAllNewsPaper();
    static ArrayList<Document> documents = service.getAllDocument();
    static ArrayList<Knowledge> knowledges = service.getAllData();

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("1 - Xem danh sách theo từng thể loại");
        System.out.println("2 - Tìm tài liệu theo tên");
        System.out.println("3 - Kiểm tra ebook có lượt tải nhiều nhất");
        System.out.println("4 - Tìm các báo phát hành trong năm hiện tại");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while(isContinue){
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Danh sách thể loại tài liệu có trong thư viện");
                    service.getALlType(knowledges);
                    System.out.println("Nhập thể loại muốn kiểm tra");
                    String type = sc.nextLine();
                    service.searchByType(knowledges,type);
                    break;
                case 2:
                    System.out.println("Nhập tên tài liệu muốn tìm kiếm");
                    String name = sc.nextLine();
                    service.searchByName(knowledges,name);
                    break;
                case 3:
                    System.out.println("Tài liệu có lượt tải nhiều nhất là: ");
                    service.highestDownloadDocument(documents);
                    break;
                case 4:
                    System.out.println("Báo phát hành trong năm nay: ");
                    service.searchByPublishingYear(newsPapers);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}

