public class Person {

    String name;
    int age;
    int height;
    double weight;
    int money;
    // Если поставить private перед int money; то
    // в классе Main появится ошибка
    // и станут недоступны любые операции с этим полем

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {}

    public void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }

    public void goToWork() {
        if (age < 18 || age > 70){
            System.out.println("отдыхаю дома");
        }
        else System.out.println("работаю");
    }

    public int getMoney() {
        return money;
    }

}
