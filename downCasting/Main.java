class Animal {
    void eat (){
        System.out.println("Animal is eating!!");
    }
}

class Dog extends Animal{
    @Override
    void eat (){
        System.out.println("Dog is eating");
    }

    void sound (){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.eat();

        if (myAnimal instanceof Dog){
             Dog dog =(Dog) myAnimal;
             dog.sound();
        }

        Animal anotherAnimal = new Animal();
    }
}