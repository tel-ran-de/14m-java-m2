package lesson05.uni;

public class UniUser extends Person {
    String firstName;
    private String secondName;
    String uniID;
    int age;
    int yearOfEnter;
    String address;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public UniUser(String firstName) {
        this.firstName = firstName;
    }

    public UniUser(String firstName, String secondName, String uniID, int yearOfEnter, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.yearOfEnter = yearOfEnter;
        this.address = address;
    }

    public UniUser(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public UniUser(String firstName, String secondName, String uniID, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
    }

    protected void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    private void walks() {
        System.out.println("Ходит по кампусу");
    }

    public static UniUser[] deletePerson(UniUser[] arr, int indexToDelete) {
        UniUser[] arrNew = new UniUser[arr.length - 1];
        for (int i = 0; i < indexToDelete; i++) {
            arrNew[i] = arr[i];
        }
        for (int i = indexToDelete; i < arr.length-1; i++) {
            arrNew[i] = arr[i + 1];
        }
        return arrNew;
    }

    public static UniUser[] changePerson(UniUser[] arr, int indexOfChanging, UniUser newUser) {
        UniUser[] arrNew = new UniUser[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[indexOfChanging] = newUser;
        return arrNew;
    }

    public static UniUser[] addPerson(UniUser[] arr, UniUser newUser) {
        UniUser[] arrNew = new UniUser[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arr.length] = newUser;
        return arrNew;
    }

    public static void sortPersonsAge(UniUser[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].age > input[i + 1].age) {
                int temp = input[i].age;
                input[i].age = input[i + 1].age;
                input[i + 1].age = temp;
                count++;
            }
        }
        if (count > 0) {
            sortPersonsAge(input);
        }
    }

    public static void printArr(UniUser[] input) {
        for (UniUser element : input) {
            System.out.println(element.getFirstName() + " " + element.getAge());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", age=" + age +
                '}';
    }
}
