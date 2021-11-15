import java.util.ArrayList;

public class Student {
    private  long id;
    private  String name;
    private  ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double getGradeAverage(){
        Integer sum = 0;
        for (Integer singleGrade : this.grades){
            if(!this.grades.isEmpty()){
                sum += singleGrade;
            }
        }
        return sum / this.grades.size();
    }

    public void addGrade(double grade){
        grades.add((int) grade);
    }

}
