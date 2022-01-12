package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Movie {

        @SerializedName("id")
        private int id;

        @SerializedName("title")
        private String title;

        @SerializedName("length")
        private int length;

        @SerializedName("category")
        private String[] category;

        @SerializedName("view")
        private int view;

        @SerializedName("year")
        private int releaseDate;

        @Override
        public String toString() {
                return  "id=" + id +
                        " - Tiêu đề: " + title +
                        " - Độ dài: " + length +
                        " - Thể loại: " + Arrays.toString(category) +
                        " - Lượt xem " + view +
                        " - Năm sản xuất: " + releaseDate;

        }
}
