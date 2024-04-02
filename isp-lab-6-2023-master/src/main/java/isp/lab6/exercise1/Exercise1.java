package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();

        system.addStudent(new Student("Tudor", 1));
        system.addStudent(new Student("Amy", 2));

        system.addGrade(1, "Math", 90);
        system.addGrade(1, "Science", 85);
        system.addGrade(2, "Math", 99);
        system.addGrade(2, "Science", 92);

        system.displayStudents();

        system.findStudent(1).displayGrades();

        System.out.println("Average grade of Tudor: " + system.findStudent(1).calculateAverageGrade());
        System.out.println("Average grade of Amy: " + system.findStudent(2).calculateAverageGrade());


        system.removeStudent(2);
        system.displayStudents();

        system.updateStudent(1, "Tudorel");
        system.displayStudents();
    }
}
