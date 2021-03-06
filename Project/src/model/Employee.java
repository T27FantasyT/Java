package model;

public class Employee {
    private int id;
    private String name;
    private Sex sex;
    private Position position;
    private String tel;
    private String email;
    private String password;

    public Employee(int id, String name, Sex sex, Position position, String tel, String email, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.position = position;
        this.tel = tel;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + id + " - Tên nhân sự: " + name
                + " - Giới tính: " + sex.getValue() + " - Vị trí: "
                + position.getValue() + " - Số điện thoại: " + tel
                + " - Địa chỉ email: " + email
                + " - Mật khẩu: " + password;
    }
}
