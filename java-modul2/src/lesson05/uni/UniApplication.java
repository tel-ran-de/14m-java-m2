package lesson05.uni;

import java.util.Arrays;

public class UniApplication {
    public static void main(String[] args) {
        Student sasha = new Student("Саша", 19, true);
        Student fedya = new Student("Федя", 20, true);
        Student katya = new Student("Катя", 21, false);
        Teacher mariaP = new Teacher("Мария Петровна", 46, true);
        Teacher kseniaF = new Teacher("Ксения Федоровна", 34, false);
        Teacher sergeI = new Teacher("Сергей Иванович", 56, true);
        Worker glasha = new Worker("Глаша", 38, false);
        Worker petr = new Worker("Петр", 46, false);
        Worker vasilii = new Worker("Василий", 62, false);
        Student[] allStudents = new Student[]{sasha, fedya, katya};
        Teacher[] allSTeachers = new Teacher[]{mariaP, kseniaF, sergeI};
        Worker[] allWorkers = new Worker[]{glasha, petr, vasilii};
        UniUser[] allPersons = new UniUser[]{sasha, fedya, katya, mariaP, kseniaF, sergeI, glasha, petr, vasilii};

        UniUser.sortPersonsAge(allStudents);
        UniUser.sortPersonsAge(allSTeachers);
        UniUser.sortPersonsAge(allWorkers);
        UniUser.sortPersonsAge(allPersons);
        UniUser.printArr(allPersons);
        UniUser.printArr(allStudents);
        UniUser.printArr(UniUser.addPerson(allStudents, glasha));
        UniUser.printArr(UniUser.changePerson(allStudents, 1, petr));
        UniUser.printArr(UniUser.deletePerson(allStudents, 1));
    }


}
