public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("Шарик");
    dog.setAge(5);
    System.out.println(dog.getName());
    System.out.println(dog.getAge());
    }
}

class Dog {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
