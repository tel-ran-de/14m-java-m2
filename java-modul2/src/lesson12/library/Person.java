package lesson12.library;

import java.time.LocalDate;

/**
 * 14m-modul2-mono-rep
 * 19 10 : 33
 */
public class Person {
    private String name;
    private LocalDate birthDate;
    //private Skills[] skills  = new Skills[128];
    private Skills[] skills;
    private int countSkills;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        skills = new Skills[Genre.values().length];
        countSkills = 0;
    }

    public boolean addSkill(Skills skill) {
        if (countSkills < skills.length) {
            skills[countSkills] = skill;
            countSkills++;
            return true;
        }
        return false;
    }

    public boolean addSkills(Skills... skills) {
        int temp = countSkills;
        int temp2 = skills.length;
        for (int i = temp; i < temp + skills.length; i++) {
            if (countSkills < this.skills.length) {
                this.skills[i] = skills[i - temp];
                countSkills++;
                temp2--;
            }
            if (i == temp + skills.length - 1) {
                return true;
            }
        }
        System.out.println("Добавление не удалось, всего не добавлено"
                + temp2);
        return false;
    }


    /*
        public void setSkills(Skills... skills) {
            this.skills = skills;
            countSkills += skills.length;
        }
    */
}
