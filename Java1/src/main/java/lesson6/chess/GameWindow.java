package lesson6.chess;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow() throws HeadlessException {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
