package app.models;

public class Person {
    private String name;
    private int age;
    private String profession;


    public Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ім'я:" + name +
                ", Вік:" + age +
                ", Професія:" + profession;
    }
}
