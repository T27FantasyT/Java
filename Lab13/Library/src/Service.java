import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service {
    public ArrayList<Knowledge> getAllData() {
        ArrayList<Knowledge> list = new ArrayList<>();
        list.add(new TextBook(1, "Kinh tế vĩ mô", new String[]{"Kinh tế", "Giáo dục"}, "NXB Giáo dục", "1994", 50, 300, "Nguyễn Văn A"));
        list.add(new TextBook(2, "Kinh tế học tài chính", new String[]{"Kinh tế", "Tài chính"}, "NXB Giáo dục", "2004", 550, 200, "Nguyễn Văn B"));
        list.add(new Document(3, "Slide kinh tế lượng", new String[]{"Kinh tế", "Thống kê"}, "NXB Trẻ", "2014", 500, "Ảnh 1", 500));
        list.add(new Document(4, "Slide Tài chính doanh nghiệp", new String[]{"Tài chính", "Thống kê"}, "NXB Trẻ", "2054", 506, "Ảnh 2", 500));
        list.add(new NewsPaper(5, "Cafef", new String[]{"Kinh tế", "Chứng khoán", "Bất động sản"}, "Cafef", "24/01/1994", 40, 20));
        list.add(new NewsPaper(6, "Vietstock", new String[]{"Chứng khoán", "Bất động sản"}, "Cafef", "24/01/1994", 40, 20));

        return list;
    }

    public void getALlType(ArrayList<Knowledge> list) {
        ArrayList<String> type = new ArrayList<>();
        for (Knowledge k : list) {
            for (String s : k.getType()) {
                if (!type.contains(s)) {
                    type.add(s);
                }
            }
        }
        for (String s : type) {
            System.out.println(s);
        }
    }


    public void searchByType(ArrayList<Knowledge> list, String word) {
        for (Knowledge k : list) {
            for (String s : k.getType()) {
                if (s.equals(word)) {
                    System.out.println(k);
                }
            }
        }
    }

    public void searchByName(ArrayList<Knowledge> list, String name){
        int count = 0;
        for(Knowledge k : list){
            if(k.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(k);
                count++;
            };
        }
        if(count == 0){
            System.out.println("Không có tài liệu này");
        }
    }

    public void highestDownloadDocument(ArrayList<Knowledge>list){
        ArrayList<Document> documents = new ArrayList<>();
        documents.add(new Document(3, "Slide kinh tế lượng", new String[]{"Kinh tế", "Thống kê"}, "NXB Trẻ", "2014", 500, "Ảnh 1", 500));
        documents.add(new Document(4, "Slide Tài chính doanh nghiệp", new String[]{"Tài chính", "Thống kê"}, "NXB Trẻ", "2054", 506, "Ảnh 2", 500));
        Collections.sort(documents, new Comparator<Document>() {
            @Override
            public int compare(Document o1, Document o2) {
                return o1.getTotalDownload()-o2.getTotalDownload();
            }
        });
        for(int i = documents.size();i>documents.size()-2;i--){
            System.out.println(documents.get(i));
        }
    }

    public void(ArrayList<Knowledge> list){
        for(Knowledge k : list){
            if(LocalDate.now().)
        }
    }

}
