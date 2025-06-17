package zoo2;

public class Fish extends Animal{
   public Fish() {
       super(2, "Fish");
   }

    @Override
    void makeSound() {
        System.out.println("Fish doesn`t talk");
    }

    @Override
    void move() {
        System.out.println("Fish is swimming");
    }
}
