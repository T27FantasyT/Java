import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service {

    ArrayList<TextBook> textBooks = new ArrayList<>();
    ArrayList<NewsPaper> newsPapers = new ArrayList<>();
    ArrayList<Document> documents = new ArrayList<>();
    ArrayList<Knowledge> knowledges = new ArrayList<>();

    public ArrayList<TextBook> getAllTextBook(){
        textBooks.add(new TextBook(1,"Kinh tế vĩ mô",new String[]{"Kinh tế"},"NXB Giáo Dục", LocalDate.of(1994,12,20),50,300,"Nguyễn Văn A"));
        textBooks.add(new TextBook(2,"Kinh tế học tài chính",new String[]{"Kinh tế","Tài chính"},"NXB Giáo Dục", LocalDate.of(1998,12,20),70,350,"Nguyễn Văn B"));
        return textBooks;
    }

    public  ArrayList<NewsPaper> getAllNewsPaper(){
        newsPapers.add(new NewsPaper(1,"Cafef",new String[]{"Kinh tế","Bất động sản","Chứng khoán"},"Cafef",LocalDate.of(2022,1,14),10,5));
        newsPapers.add(new NewsPaper(2,"Dân trí",new String[]{"Kinh tế","Bất động sản","Chứng khoán","Thể thao","Giải trí"},"Nhân dân",LocalDate.of(2021,11,14),5,10));
        return newsPapers;
    }

    public ArrayList<Document> getAllDocument(){
        documents.add(new Document(1, "Slide kinh tế lượng", new String[]{"Kinh tế", "Thống kê"}, "NXB Trẻ", LocalDate.of(2034,12,12), 500, "Ảnh 1", 500));
        documents.add(new Document(2, "Slide Tài chính doanh nghiệp", new String[]{"Tài chính", "Thống kê"}, "NXB Trẻ", LocalDate.of(2122,12,12), 506, "Ảnh 2", 500));
        return documents;
    }

    public ArrayList<Knowledge> getAllData(){
        knowledges.addAll(textBooks);
        knowledges.addAll(newsPapers);
        knowledges.addAll(documents);
        return knowledges;
    }

    public void searchByType(ArrayList<Knowledge> knowledges,String word){
        int count = 0;
        for(Knowledge k : knowledges){
            for(String s : k.getType()){
                if(s.toLowerCase().contains(word.toLowerCase())){
                    System.out.println(k);
                }
            }
        }
    }

    public void getALlType(ArrayList<Knowledge> knowledges) {
        ArrayList<String> type = new ArrayList<>();
        for (Knowledge k : knowledges) {
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

    public void searchByName(ArrayList<Knowledge> knowledges, String name){
        int count = 0;
        for(Knowledge k : knowledges){
            if(k.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(k);
                count++;
            };
        }
        if(count == 0){
            System.out.println("Không có tài liệu này");
        }
    }

    public void highestDownloadDocument(ArrayList<Document> documents){
        Collections.sort(documents, new Comparator<Document>() {
            @Override
            public int compare(Document o1, Document o2) {
                return o2.getTotalDownloaded()-o1.getTotalDownloaded();
            }
        });
        for(int i = 0;i<1;i++){
            System.out.println(documents.get(i));
        }
    }

    public void searchByPublishingYear(ArrayList<NewsPaper> newsPapers){
        for(NewsPaper n : newsPapers){
            if(n.getPublishingDate().getYear()==LocalDate.now().getYear()){
                System.out.println(n);
            }
        }
    }


}
