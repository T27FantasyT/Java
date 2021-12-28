import java.util.Scanner;

public class PersonServices {
    public Person[] getAllPerson(){

        Person[] persons = new Person[3];
        persons[0] = new Person("Bob",25,Sex.MALE,"HN");
        persons[1] = new Person("Bobb",26,Sex.FEMALE,"HCM");
        persons[2] = new Person("Bobbb",27,Sex.FEMALE,"DN");
        return persons;
    }

    public void show(Person[] persons){
        for(Person p : persons){
            System.out.println(p);
        }
    }

    public Person createPerson(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập id: ");
//        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("1 - Nữ");
        System.out.println("0 - Nam");
        int choice = sc.nextInt();
        Sex gender = Sex.FEMALE;
        if(choice ==1){
            gender = Sex.FEMALE;
        } else if (choice == 0){
            gender = Sex.MALE;
        }
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        Person newperson = new Person(name,age,gender,address);
        return newperson;
    }

    public Person[] addperson(int size){
        Person[] persons = new Person[size];
        for(int i = 0; i<size; i++){
            persons[i] = createPerson();
        }
        return  persons;
    }
}
