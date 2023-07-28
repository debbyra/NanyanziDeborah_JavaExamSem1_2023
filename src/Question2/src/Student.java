import java.util.ArrayList;
import java.util.List;

public class Student {
//    attributes for the student class
    String name;
    private List<Double> courses;
    private List<Double> grades;

//    setter and getter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getCourse() {
        return courses;
    }

    public void setCourse(List<Double> course) {
        this.courses = course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

//    method to add courses
    public void addCourse(Double course ){
        if (courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(course);
    }

    //    method to add grades
    public void addGrade(double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }

    public static void main(String[] args) {
//        instance for the student class
        Student obj = new Student();
//        set data for the student
        obj.setName("Annet");
//        add courses taken and the grades acquired
        obj.addCourse(131.0);
        obj.addCourse(221.0);

        obj.addGrade(78.9);
        obj.addGrade(54.5);



        System.out.println("Name: "+obj.getName());
        System.out.println("Grades attained: "+obj.getGrades());
        System.out.println("Courses in codes: "+ obj.getCourse());
    }
}
