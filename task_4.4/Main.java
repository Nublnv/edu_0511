public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog spikeDog = new Dog("Spike",30,150);
        Cat tomCat = new Cat("Tom",4,20);
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}

class Dog{
    String name;
    int weight;
    int height;

    public Dog(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
}

class Cat{
    String name;
    int weight;
    int height;

    public Cat(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
}
