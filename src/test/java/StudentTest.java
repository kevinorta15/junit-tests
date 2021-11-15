import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student kevin = new Student(113, "Kevin");

    @Test
    public void hasID(){
        assertEquals(0, Student.id, 0);
    }

    @Test
    public void hasName(){
        assertNull(Student.name);
    }

    @Test
    public void isGradesEmpty(){
        assertTrue(Student.grades.isEmpty());
    }
}
