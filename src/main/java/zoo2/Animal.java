package zoo2;

public abstract class Animal {
    protected int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    abstract void makeSound();
    abstract void move();
}
