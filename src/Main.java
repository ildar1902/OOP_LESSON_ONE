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
//        Задание 1.

        System.out.println("    ООП. Урок 1. ДЗ 1");
        System.out.println("Задание 1");
        System.out.println();
        Human maksim = new Human(1988, "Максим", "Минск");
        Human anna = new Human(1993, "Аня", "Москва");
        Human katya = new Human(1992, "Катя", "Калининград");
        Human artyom = new Human(1995, "Артём", "Москва");
        maksim.sayHello();
        anna.sayHello();
        katya.sayHello();
        artyom.sayHello();
//        System.out.println(maksim); так можно вывести приветствие для каждого объекта,
//        если использовать третий способ ( метод toString() )

    }
}