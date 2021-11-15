import java.util.ArrayList;

public class Student {
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Student.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void setGrades(ArrayList<Integer> grades) {
        Student.grades = grades;
    }

    public double getGradeAverage(){
        Integer sum = 0;
        for (Integer singleGrade : grades){
            if(!grades.isEmpty()){
                sum += singleGrade;
            }
        }
        return sum / grades.size();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

}
