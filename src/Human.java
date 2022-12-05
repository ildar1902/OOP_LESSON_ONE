public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null || name.isEmpty()) {
            this.name = "'Информация не указана'";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
           this.town = "'Информация не указана'";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
           this.jobTitle = "'Информация не указана'";
        } else {
            this.jobTitle = jobTitle;
        }
        /* System.out.println("Привет! Меня зовут " + name + ", я из города "
        + town + ", я " + yearOfBirth + "-го года рождения. Будем знакомы!");*/ // первый способ
//       можно приветствие прописать в конструкторе, я выбрал вариант, который ближе к тому, что показали в видео-уроке
    }

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ", я из города "
                + town + ", я " + yearOfBirth + "-го года рождения. Я работаю на должности "
                + jobTitle + ". Будем знакомы!"); // второй способ, используя метод sayHello()
    }

   /* @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", я из города " + town + ", я " + yearBirth + "-го года рождения. Будем знакомы!";
    }*/     //третий способ, как можно вывести приветствие, используя метод toString()
}
