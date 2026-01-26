package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setName("Иванов Иван Иванович");
        ivan.setGroup("0603");
        ivan.setEnrolled(2006, 7, 20);
        System.out.println(ivan.getName() + " зачислен в группу "
                + ivan.getGroup() + " с " + ivan.getEnrolled());
    }
}
