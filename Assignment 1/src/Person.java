public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = (gender.equalsIgnoreCase("Male")) ? "Male" : "Female";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + gender + ".";
    }
}
