package zoo2;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal fish = new Fish();

        Manager manager = new Manager();

        manager.show(bird);
        manager.show(fish);
    }
}
