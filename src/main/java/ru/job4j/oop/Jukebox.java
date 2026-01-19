package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song1 = """
                Пусть бегут неуклюже
                Пешеходы по лужам
                А вода по асфальту рекой.
                И неясно прохожим
                В этот день непогожий,
                Почему я веселый такой?""";

        String song2 = """
                Спят усталые игрушки, книжки спят.
                Одеяла и подушки ждут ребят.
                Даже сказка спать ложится,
                Чтобы ночью нам присниться.
                Ты ей пожелай:
                Баю-бай.""";

        switch (position) {
            case 1:
                System.out.println(song1);
                break;
            case 2:
                System.out.println(song2);
                break;
            default:
                System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox demo = new Jukebox();
        demo.music(1);
        System.out.println("_____________");
        demo.music(2);
        System.out.println("_____________");
        demo.music(3);
        System.out.println("_____________");
        demo.music(500);
        System.out.println("_____________");
    }
}
