public class Animal {

    private String color;
    private int age;
    private char gender;


    //    constructor
    public Animal(String color, int age, char gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    //    getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


//    toString method

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
