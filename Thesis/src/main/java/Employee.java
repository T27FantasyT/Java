import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Employee {
    @SerializedName("id")
    private int id;
    @SerializedName("full_name")
    private String name;
    @SerializedName("position")
    private String position;
    @SerializedName("email")
    private String email;
    @SerializedName("tel")
    private String tel;
    @SerializedName("address")
    private String address;
    @SerializedName("password")
    private String password;
    @SerializedName("gender")
    private String gender;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                gender +
                '}';
    }
}
