public class Main {
    public static void main(String[] args) {

        System.out.println("        2 курс");
        System.out.println();
        System.out.println("    ООП. Урок 1 (введение, object)");
        System.out.println();
        Cat barsik = new Cat("Барсик", 18);
        barsik.meow();
        System.out.println();
        Cat murzik = new Cat("Мурзик", 8);
        murzik.meow();
        Cat pushok = new Cat("Пушок", 7);
        pushok.meow();
        barsik.friends = null;
        barsik.addFriend(murzik);
        System.out.println("У кота " + barsik.name + "а " + barsik.getFriends().length + " друзей");
        barsik.friends[0].meow();

//        ДЗ

        System.out.println("    ООП. Урок 1. ДЗ");
        System.out.println();
        Human maksim = new Human(1988, "Максим", "Минск","бренд-менеджер");
        Human anna = new Human(1993, "Аня", "Москва","методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград","продакт-менеджер");
        Human artyom = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        maksim.sayHello();
        anna.sayHello();
        katya.sayHello();
        artyom.sayHello();
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "red", 2018, "south Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "south Korea");
//        System.out.println(maksim); так можно вывести приветствие для каждого объекта,
//        если использовать третий способ ( метод toString() )

        System.out.println();
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmw);
        System.out.println(kiaSportage);
        System.out.println(hyundai);
    }

}