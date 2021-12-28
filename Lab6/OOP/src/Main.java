public class Main {
    public static void main(String[] args) {

//        Animal cat = new Animal();
//        cat.name = "kitty";
//        cat.age = 3;
//        cat.leg = 4;
//        cat.color = "white";
//
//        System.out.println(cat);
//
//        cat.eat("fish");
//
//        Animal dog = new Animal("A",5,4,"black");

//        Person Jane = new Person("Jane", 25,Sex.FEMALE,"HN");
//        System.out.println(Jane);
//        Jane.job("Teacher");
//
//        Person John = new Person("John", 30,Sex.MALE, "HCM");
//        System.out.println(John);
////        John.job("Freelance");
//         Dog German = new Dog("German Shepheds", Size.LARGE,"White % Gray", 6);
//         German.eat("Bone");
//        System.out.println(German);


        PersonServices personServices = new PersonServices();
        Person[] persons = personServices.addperson(1);
        personServices.show(persons);

    }
}
