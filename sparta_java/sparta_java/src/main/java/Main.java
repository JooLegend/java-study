class Animal{
    String name;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println(name + "is Crying");
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void cry(){
        System.out.println(name + "is Barking!!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("코코");
        dog.cry();


    }
}