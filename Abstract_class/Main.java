abstract  class Animal {
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound (){
        System.out.println("Dog barks");
    }
}

class Cat extends  Animal {
    @Override
    void sound (){
       System.out.println("Cat mews!!");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();

        Animal myCat = new Cat();
        myCat.sound();
    }
}