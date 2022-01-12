import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1,"Batman",1994,"Hành động",90,4000));
        movies.add(new Movie(2,"Catman",1995,"Hành động",197,44000));
        movies.add(new Movie(3,"Datman",1996,"Hành động",190,4400));

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("list film sau khi sắp xếp theo tên: ");
        show(movies);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength() - o2.getLength();
            }
        });

        System.out.println("List film sau khi sắp xếp theo độ dài: ");
        show(movies);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });

        System.out.println("List film sau khi sắp xếp theo lượt view: ");
        show(movies);


    }

    public static void show(ArrayList<Movie> movies){
        for( Movie m : movies){
            System.out.println(m);
        }
    }
}
