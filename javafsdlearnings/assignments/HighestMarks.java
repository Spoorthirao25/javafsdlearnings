import java.util.ArrayList;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 75));
        students.add(new Student("Anjali", 85));
        students.add(new Student("Kiran", 90));
        students.add(new Student("Sneha", 80));

        Student topStudent = students.get(0);

        for (Student s : students) {
            if (s.marks > topStudent.marks) {
                topStudent = s;
            }
        }

        System.out.println("Student with Highest Marks:");
        System.out.println(topStudent.name + " - " + topStudent.marks);
    }
}