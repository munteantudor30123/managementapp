package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    private int id;
    private HashMap<String, Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void updateGrade(String subject, int newGrade) {
        if (grades.containsKey(subject)) {
            grades.put(subject, newGrade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Subject not found.");
        }
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + " (ID: " + id + "):");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
