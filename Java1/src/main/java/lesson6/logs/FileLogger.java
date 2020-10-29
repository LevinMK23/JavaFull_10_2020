package lesson6.logs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements Logger {

    private String path;
    private FileOutputStream fos;

    public FileLogger(String path) throws IOException {
        this.path = path;
        File file = new File("lesson6.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        fos = new FileOutputStream(file, true);
    }

    @Override
    public void log(String message) {
        try {
            fos.write(("[" + path + "] " + message + "\n").getBytes());
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
