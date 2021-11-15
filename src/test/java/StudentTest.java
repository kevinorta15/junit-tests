import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student kevin = new Student(1L, "Kevin");

    @Test
    public void canCreateAStudent(){
        Student student = new Student(4342, "Kevin");
    }

    @Test
    public void hasID(){
        assertEquals(1L, kevin.getId(), 0);
    }

    @Test
    public void hasName(){
        assertNotNull(kevin.getName());
    }

    @Test
    public void isGradesEmpty(){
        assertTrue(kevin.getGrades().isEmpty());
    }

    @Test
    public void canAddGrade(){
        kevin.addGrade(100);
        System.out.println(kevin.getGrades().size());
        assertEquals(1, kevin.getGrades().size());
    }

    @Test
    public void canGetAverage(){
        kevin.addGrade(85.6);
        kevin.addGrade(90.5);
        kevin.addGrade(100);
        System.out.println(kevin.getGradeAverage());
        assertEquals(91, kevin.getGradeAverage(),0.5);
    }
}
