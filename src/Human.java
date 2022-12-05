import java.time.LocalDate;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    int age;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        age = LocalDate.now().getYear() - yearOfBirth; //немного доработал, чтобы каждый называл сразу свой возраст
        /* System.out.println("Привет! Меня зовут " + name + ", я из города "
        + town + ", мне " + age + ". Будем знакомы!");*/ // первый способ
//       можно приветствие прописать в конструкторе, я выбрал вариант, который ближе к тому, что показали в видео-уроке
    }

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ", я из города "
                + town + ", мне " + age + ". Я работаю на должности " + jobTitle + ". Будем знакомы!"); // второй способ, используя метод sayHello()
    }

   /* @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", я из города " + town + ", мне " + age + ". Будем знакомы!";
    }*/     //третий способ, как можно вывести приветствие, используя метод toString()
}
