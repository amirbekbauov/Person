class Person {
    private String fullName;
    private int age;

    // конструктор
    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    // конструктор с именем и возрастом
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // метод про движение
    public void move() {
        System.out.println(this.fullName + " is moving.");
    }

    // метод про разговор
    public void talk() {
        System.out.println(this.fullName + " is talking.");
    }
}

public class Main {
    public static void main(String[] args) {
        // два объекта
        Person person1 = new Person();  // дефолт конструктор
        Person person2 = new Person("John Doe", 30);  // конструктор с параметром

        // вызовы методов
        person1.move();
        person2.talk();
    }
}
