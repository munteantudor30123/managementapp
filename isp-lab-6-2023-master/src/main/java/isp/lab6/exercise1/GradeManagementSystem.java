package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GradeManagementSystem {
    private List<Student> students;

    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int id) {
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int id, String name) {
        Student student = findStudent(id);
        if (student != null) {
            student.name = name;
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void addGrade(int id, String subject, int grade) {
        Student student = findStudent(id);
        if (student != null) {
            student.addGrade(subject, grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }
        }
    }
}