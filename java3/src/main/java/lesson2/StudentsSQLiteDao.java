package lesson2;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentsSQLiteDao implements StudentsDao, Closeable {

    private static final String STUDENTS_TABLE = "CREATE TABLE IF NOT EXISTS STUDENTS\n" +
            "(\n" +
            "    ID         INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    NAME       TEXT NOT NULL,\n" +
            "    SURNAME    TEXT NOT NULL,\n" +
            "    BIRTH_DATE DATE,\n" +
            "    GROUP_ID   INTEGER\n" +
            ");";

//    private static final String IVAN = "INSERT INTO STUDENTS (NAME, SURNAME) VALUES ('Ivanov', 'Ivan')";
//    private static final String PETR = "INSERT INTO STUDENTS (NAME, SURNAME) VALUES ('Petrov', 'Petr')";

    private Connection connection;
    private Statement statement;

    public StudentsSQLiteDao() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:geekbrainsDB");
        statement = connection.createStatement();
        statement.execute(STUDENTS_TABLE);
//        statement.execute(IVAN);
//        statement.execute(PETR);
    }

    @Override
    public boolean studentExists(int id) throws SQLException {
        String sql = String.format("SELECT ID FROM STUDENTS WHERE ID = %d", id);
        ResultSet rs = statement.executeQuery(sql);
        return rs.next();
    }

    @Override
    public Student getStudentById(int id) throws SQLException {
        String sql = String.format("SELECT * FROM STUDENTS WHERE ID = %d", id);
        Student student = new Student(null, null);
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            student.setId(rs.getInt("ID"));
            student.setName(rs.getString("NAME"));
            student.setSurname(rs.getString("SURNAME"));
            student.setBirthDate(new Timestamp(rs.getLong("BIRTH_DATE"))
                    .toLocalDateTime()
                    .toLocalDate());
            student.setGroup(rs.getInt("GROUP_ID"));
        }
        return student;
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        String sql;
        if (student.getId() != 0 && studentExists(student.getId())) {
            sql = String.format("UPDATE STUDENTS SET NAME = '%s', SURNAME = '%s', " +
                    "BIRTH_DATE = %d, GROUP_ID = %d WHERE ID = %d",
                    student.getName(),
                    student.getSurname(),
                    student.getBirthDate().toEpochDay(),
                    student.getGroup(),
                    student.getId());
        } else {
            sql = String.format("INSERT INTO STUDENTS (NAME, SURNAME, BIRTH_DATE, GROUP_ID) " +
                    "VALUES ('%s', '%s', %d, %d)",
                    student.getName(),
                    student.getSurname(),
                    student.getBirthDate().toEpochDay(),
                    student.getGroup());
        }
        statement.execute(sql);
    }

    @Override
    public void close() throws IOException {
        try {
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
