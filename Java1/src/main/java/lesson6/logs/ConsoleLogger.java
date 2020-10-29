package lesson6.logs;

public class ConsoleLogger implements Logger {

    private String path;

    public ConsoleLogger(String path) {
        this.path = path;
    }

    @Override
    public void log(String message) {
        System.out.println("[" + path + "] " + message);
    }
}
