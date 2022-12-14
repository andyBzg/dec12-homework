public class Main {
    public static void main(String[] args) {

        Person father = new Person("Vasya", 36, 182, 75.6);
        Person mother = new Person("Akulina", 31, 164, 54.5);
        Person kid = new Person("Maloy", 5, 120,25.6);
        Person grandfather = new Person("Ded", 79, 171, 80.1);
        Person postman = new Person();

        father.money = 101;
        System.out.println(father.getMoney());

        postman.money = 404;
        int postmanMoney = postman.getMoney();
        System.out.println(postmanMoney);

    }
}