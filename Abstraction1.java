abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars: Roooaaarrr!");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls: Grrrrrr!");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();

        Animal[] animals = {lion, tiger};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}