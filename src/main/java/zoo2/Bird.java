package zoo2;

public class Bird extends Animal{
   public Bird() {
       super(5, "Bird");
   }


    @Override
    void makeSound() {
        System.out.println("Bird sings a song");
    }

    @Override
    void move() {
        System.out.println("Bird is flying");
    }
}
