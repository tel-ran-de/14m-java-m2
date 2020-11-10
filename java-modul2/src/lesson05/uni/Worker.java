package lesson05.uni;

public class Worker extends UniUser {
    private String position;
    private double hoursPerMonth;
    private boolean paycheckDone;

    public Worker(String firstName) {
        super(firstName);
    }

    public Worker(String uniID, int age) {
        super(uniID, age);
    }

    public Worker(String firstName, String secondName, String uniID, int yearOfEnter, String address, double hoursPerMonth) {
        super(firstName, secondName, uniID, yearOfEnter, address);
        this.hoursPerMonth = hoursPerMonth;
    }

    public Worker(String firstName, int age, boolean paycheckDone) {
        super(firstName, age);
        this.paycheckDone = paycheckDone;
    }

    public void works() {
        System.out.println("Работать!");
    }

    public void paycheck() {
        System.out.println("Зарплата выплачена: " + paycheckDone);
    }

}
