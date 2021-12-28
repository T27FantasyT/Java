public class Person {
    public int id;
    public String name;
    public int age;
    public Sex gender;
    public String address;
    public static String school = "Techmaster";

    public Person() {
    }

    public Person(String name, int age, Sex gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.getValue() +
                ", address='" + address + '\'' +
                '}';


}

    public void job(String job){
        System.out.println(name+"'s job: "+job);
    }
}
