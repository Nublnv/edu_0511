public class Main{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
        Pegasus pegasus = new Pegasus();
        pegasus.fly();
    }
}

abstract class Animal {
    String type;
    String color;
}

class Horse extends Animal{
    public void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}

class Pegasus extends Horse{
    public void fly(){
        System.out.println("Игого, я полетел(а)");
    }
}
