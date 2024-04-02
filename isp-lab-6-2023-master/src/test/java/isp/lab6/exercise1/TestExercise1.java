package isp.lab6.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestExercise1 {

    private GradeManagementSystem system;

    @Before
    public void setUp() {
        system = new GradeManagementSystem();
    }

    @Test
    public void testAddGrade() {
        Student student = new Student("Alice", 2);
        system.addStudent(student);
        system.addGrade(2, "Math", 88);
        assertEquals(88, (int) system.findStudent(2).calculateAverageGrade());
    }
    @Test
    public void testAddStudent() {
        Student student = new Student("John", 1);
        system.addStudent(student);
        assertNotNull(system.findStudent(1));
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student("John", 1);
        system.addStudent(student);
        system.removeStudent(1);
        assertNull(system.findStudent(1));
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("Alice", 2);
        system.addStudent(student);
        system.updateStudent(2, "Alice Smith");
        assertEquals("Alice Smith", system.findStudent(2).getName());
    }

}


