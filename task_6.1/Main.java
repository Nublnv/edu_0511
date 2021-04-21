public class Main {
    public static void main(String[] args) {
        int medKit = 50;
        Person nina = new Person("Нина", 60, null,null);
        Person semen = new Person("Семен", 69, null, null);
        Person olga = new Person("Ольга",35,nina,semen);
        Person anna = new Person("Анна", 62, null,null);
        Person sergey = new Person("Сергей", 66, null, null);
        Person oleg = new Person("Олег",40,anna,sergey);
        Person igor = new Person("Игорь",13,olga,oleg);
        igor.getInfo();
    }
}

class Person{
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person(String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String info= "Меня зовут "+this.name+"\n";
        if(this.mother != null){
            info += "Мою маму зовут "+this.mother.name+"\n"; // info = info + "Мою маму...";
            if (this.mother.mother != null){
                info += "Бабушка по маме "+this.mother.mother.name+"\n";
            }
            if (this.mother.father != null){
                info += "Дедушка по маме "+this.mother.father.name+"\n";
            }
        }
        if(this.father != null){
            info += "Моего папу зовут "+this.father.name+"\n";
            if (this.father.mother != null){
                info += "Бабушка по папе "+this.father.mother.name+"\n";
            }
            if (this.father.father != null){
                info += "Дедушка по папе "+this.father.father.name+"\n";
            }
        }
        System.out.println(info);
    }
    public Person getMother() {
        return mother;
    }
    public Person getFather() {
        return father;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if(this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
