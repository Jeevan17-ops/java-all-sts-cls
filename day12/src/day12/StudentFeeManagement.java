package day12;

import java.util.ArrayList;
import java.util.Random;

class d{
    int id;
    String name;
    int[] marks = new int[3];  // Marks for 3 subjects
    int feeDue;
    int totalMarks;
    int failedSubjectsCount;

    public d(int id, String name) {
        this.id = id;
        this.name = name;
        this.feeDue = 10000;  // Fee is 10,000 for each student initially
    }

    public void generateMarks() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            marks[i] = random.nextInt(101);  
        }
        calculateTotalMarks();
        checkFailSubjects();
    }

    public void calculateTotalMarks() {
        totalMarks = marks[0] + marks[1] + marks[2];
    }

    public void checkFailSubjects() {
        failedSubjectsCount = 0;
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 35) {
                failedSubjectsCount++;
            }
        }
    }

    public void applyGraceMarks() {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 35) {
                marks[i] += 3;  
                if (marks[i] > 100) marks[i] = 100;  
            }
        }
        calculateTotalMarks();
    }
}

public class StudentFeeManagement {
    public static void main(String[] args) {
        ArrayList<d> students = new ArrayList<>();
        Random random = new Random();
        int totalFeePaid = 0;
        int totalFailCount = 0;
        int totalPayingStudents = 0;

        for (int i = 0; i < 50; i++) {
            d student = new d(i + 1, "Student" + (i + 1));
            student.generateMarks();

            student.applyGraceMarks();

            if (random.nextBoolean()) {
                totalPayingStudents++;
                totalFeePaid += student.feeDue;
            }

            if (student.failedSubjectsCount > 0) {
                totalFailCount++;
            }

            students.add(student);
        }

        d topper = null;
        for (d student : students) {
            if (topper == null || student.totalMarks > topper.totalMarks) {
                topper = student;
            }
        }

        System.out.println("Total fee paid by students: " + totalFeePaid);
        System.out.println("Total number of students who should pay: " + totalPayingStudents);
        System.out.println("Total number of students who failed in one or more subjects: " + totalFailCount);
        System.out.println("Topper: " + topper.name + " with total marks: " + topper.totalMarks);

        System.out.println("\nList of students who failed in any subject:");
        for (d student : students) {
            if (student.failedSubjectsCount > 0) {
                System.out.println(student.name + " - Marks: " + student.marks[0] + ", " + student.marks[1] + ", " + student.marks[2]);
            }
        }

        System.out.println("\nList of toppers (based on total marks):");
        for (d student : students) {
            if (student.totalMarks == topper.totalMarks) {
                System.out.println(student.name + " - Total Marks: " + student.totalMarks);
            }
        }
    }
}
