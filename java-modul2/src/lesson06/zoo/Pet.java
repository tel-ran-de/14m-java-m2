package lesson06.zoo;

abstract class Pet {
    String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    abstract void moves();

    abstract void sleeps();

    protected void eats() {
        System.out.println("Трёхразовое питание как в лучших отелях Турции");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + "- name " + this.name;
    }
}

class Duck extends Pet {
/*
    String name;
*/

    public Duck(String name) {
        super(name);
        /*this.name = name;
        super.name = name;*/
    }

    public Duck() {

    }

    void moves() {
        this.flies();
    }

    void sleeps() {

    }

    void flies() {
        System.out.println("Лети птичка из класса Duck" + super.name);
    }

    @Override
    protected void eats() {
        super.eats();
        System.out.println("и после еды 5 минут полетать");
    }

    @Override
    public String toString() {
        return super.toString()+ "tustring iz daka";
    }
}

class Test {
    public static void main(String[] args) {
        Pet pet = new Duck("Дональд Дак");
        Duck duck = new Duck("Дэйзи Дак");
        pet.moves();
        duck.moves();
        Object ob = new Duck("dfgdfhgds");
        System.out.println(duck);
    }
}
