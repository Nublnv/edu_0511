public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 2;
        cat1.strength = 5;
        cat1.weight = 4;
        cat2.age = 1;
        cat2.strength = 5;
        cat2.weight = 4;
        System.out.println(cat1.fight(cat2));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int sum = 0;
        if (this.age > anotherCat.age) {
            sum++;
        } else if (this.age < anotherCat.age) {
            sum--;
        }
        if (this.weight > anotherCat.weight) {
            sum++;
        } else if (this.weight < anotherCat.weight) {
            sum--;
        }
        if (this.strength > anotherCat.strength) {
            sum++;
        } else if (this.strength < anotherCat.strength) {
            sum--;
        }
        return sum > 0;
    }
}
