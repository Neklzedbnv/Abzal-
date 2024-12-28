import java.util.*;

public class school {
    private ArrayList<Person> members;

    public school() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void raiseTeacherSalaries() {
        for (Person person : members) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.yearsOfExperience > 10) {
                    teacher.giveRaise(10);
                }
            }
        }
    }

    public void printMembers() {
        Collections.sort(members, Comparator.comparing(p -> p.surname));
        for (Person person : members) {
            System.out.println(person);
        }
    }
}
