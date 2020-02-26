public class Constructor {
    public static void main(String[] args) {
    Humans human1 = new Humans();

    }
}

class Humans {

    private String name;
    private int age;

    public Humans(){
        System.out.println("Privet iz pervogo constructora");
        this.name = "Default";
        this.age = 00;

    }

    public Humans (String name){
        System.out.println("privet iz 2 constructora");
        this.name = name;
    }

    public Humans (int age, String name) {
        System.out.println("tretiy constructor");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}