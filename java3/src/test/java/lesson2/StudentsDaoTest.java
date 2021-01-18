package lesson2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

public class StudentsDaoTest {

    StudentsDao studentsDao;

    @Before
    public void before() throws SQLException, ClassNotFoundException {
        studentsDao = new StudentsSQLiteDao();
    }

    @After
    public void after() throws IOException {
        studentsDao.close();
    }

    @Ignore
    @Test
    public void studentExists() throws SQLException {
        boolean actual = studentsDao.studentExists(1);
        Assert.assertTrue(actual);
    }

    @Ignore
    @Test
    public void getStudentById() throws SQLException {
        Student student = studentsDao.getStudentById(1);
        String actual = student.toString();
        String expected = "Student{id=1, name='adf', surname='asg', birthDate=2021-01-14, group=1}";
        Assert.assertEquals(expected, actual);
    }

    // 1 2 3 4 5 6 7 8 9
    // 1, 9, -5, 100, 4, 5

    @Ignore
    @Test
    public void updateStudent() throws SQLException {
        Student student = new Student("Ivanov", "Ivan",
                LocalDate.of(1990, 1, 1), 1);
        studentsDao.updateStudent(student);
        student = studentsDao.getStudentById(2);
        String actual = student.toString();
        String expected = "Student{id=2, name='Ivanov', surname='Ivan', birthDate=1970-01-01, group=1}";
        Assert.assertEquals(expected, actual);
    }
}