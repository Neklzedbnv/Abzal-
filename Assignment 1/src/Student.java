public class Student extends Person {
    private static int studentCounter = 1000;
    private int studentID;
    private int[] grades;

    public Student(String name, String surname, int age, String gender, int[] grades) {
        super(name, surname, age, gender);
        this.studentID = studentCounter++;
        this.grades = grades;
    }

    public void addGrade(int grade) {
        int[] newGrades = new int[grades.length + 1];
        System.arraycopy(grades, 0, newGrades, 0, grades.length);
        newGrades[grades.length] = grade;
        grades = newGrades;
    }

    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}