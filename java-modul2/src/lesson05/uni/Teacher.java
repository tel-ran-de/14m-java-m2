package lesson05.uni;


public class Teacher extends UniUser {
    private String subject;
    private String position;
    private String range;
    private String degree;
    private double hoursPerMonth;
    private boolean paycheckDone;

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstName, int age, boolean paycheckDone) {
        super(firstName, age);
        this.paycheckDone = paycheckDone;
    }

    public Teacher(String firstName, String secondName, String uniID, int age, String range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    public Teacher(String firstName, String secondName, String uniID, int yearOfEnter, String address, double hoursPerMonth) {
        super(firstName, secondName, uniID, yearOfEnter, address);
        this.hoursPerMonth = hoursPerMonth;
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    public void paycheck() {
        System.out.println("Зарплата выплачена: " + paycheckDone);
    }

    @Override
    public String toString() {
        return "Teacher{" + super.firstName + " " + this.range + "}" + this.firstName;
    }
}
