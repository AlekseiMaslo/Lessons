import javax.swing.*;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-2);
        System.out.println("vivodim znachenie " + person1.getName());
        System.out.println("vivodim znachenie " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String UserName) {

        if (UserName.isEmpty()){
            System.out.println("ti vvel pustoe imya");
        } else {
            name = UserName;
        }
    }

    public String getName () {
        return name;
    }

    public void setAge (int UserAge) {
        if (UserAge<0){
            System.out.println("vi vveli ne pravilni vozraast");
        } else {
            age = UserAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetairement (){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for (int i = 0; i<1; i++) {
            System.out.println("my name is " + name + " my age is " + age);
        }
    }
    void sayHello (){
        System.out.println("Hello");
    }
}
