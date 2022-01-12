package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service {



    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>() {
            }.getType();
            movies = gson.fromJson(reader, type);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return movies;
    }

    public void show(ArrayList<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public ArrayList<Movie> sortByReleaseDate(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getReleaseDate() - o2.getReleaseDate();
            }
        });
        return movies;
    }

    public ArrayList<Movie> sortByName(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return movies;
    }

    public void searchByName(ArrayList<Movie> movies,String word){
        int count = 0;
        for(Movie m : movies){
            if(m.getTitle().toLowerCase().contains(word.toLowerCase())){
                count++;
                System.out.println(m);
            }
        }
        if(count == 0){
            System.out.println("Bộ phim này không có trong danh sách");
        }
    }

    public void searchByCategory(ArrayList<Movie> movies, String type){
        int count = 0;
        for(Movie m : movies){
            for(String t : m.getCategory()){
                if(t.toLowerCase().contains(type.toLowerCase())){
                    count++;
                    System.out.println(m);
                }
            }
        }
        if(count ==0){
            System.out.println("Không tìm thấy film thuộc thể loại này:");
        }
    }

    public void theHighestView(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView()- o2.getView();
            }
        });

        int count = 0;
        for(int i = movies.size() - 1; i >0; i--){
            count ++;
            if(count <= 3)
            System.out.println(movies.get(i));

        }
    }


}
