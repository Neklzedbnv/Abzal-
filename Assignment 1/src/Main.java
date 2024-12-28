import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        school hogwarts = new school();

        try (BufferedReader studentReader = new BufferedReader(new FileReader("src/Data/students.txt"));
             BufferedReader teacherReader = new BufferedReader(new FileReader("src/Data/teachers.txt"))) {

            String line;
            while ((line = studentReader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                String surname = data[1];
                int age = Integer.parseInt(data[2]);
                String gender = data[3];
                int[] grades = Arrays.stream(Arrays.copyOfRange(data, 4, data.length)).mapToInt(Integer::parseInt).toArray();
                hogwarts.addMember(new Student(name, surname, age, gender, grades));
            }

            while ((line = teacherReader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                String surname = data[1];
                int age = Integer.parseInt(data[2]);
                String gender = data[3];
                String subject = data[4];
                int experience = Integer.parseInt(data[5]);
                double salary = Double.parseDouble(data[6]);
                hogwarts.addMember(new Teacher(name, surname, age, gender, subject, experience, salary));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        hogwarts.raiseTeacherSalaries();
        hogwarts.printMembers();
    }
}
