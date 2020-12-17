package lesson2;

import java.sql.SQLException;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        try(StudentsSQLiteDao dao = new StudentsSQLiteDao()) {
            for (int i = 0; i < 5; i++) {
                System.out.println(dao.studentExists(i));
            }
//        dao.updateStudent(new Student(
//                "Oleg",
//                "Olegov",
//                LocalDate.of(1990, 6, 11),
//                1));
//        dao.updateStudent(new Student(
//                "Oleg",
//                "Olegov",
//                LocalDate.of(1990, 6, 11),
//                1));
            System.out.println(dao.getStudentById(7));

            Student student = dao.getStudentById(7);
            student.setGroup(2);
            student.setSurname("Ivanov");

            dao.updateStudent(student);
            System.out.println(dao.getStudentById(7));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //dao.updateStudent();
    }
}
