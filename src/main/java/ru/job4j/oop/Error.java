package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active = " + this.active);
        System.out.println("Status = " + this.status);
        System.out.println("Message = " + this.message);
        System.out.println("____________");
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error active = new Error(true, 1, "Active error happened");
        Error passive = new Error(false, 2, "Passive error happened");
        Error additional = new Error(true, 999, "Additional active error happened");
        defaultError.printInfo();
        active.printInfo();
        passive.printInfo();
        additional.printInfo();
    }
}
