package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    private  static final ImageIcon ICON_X = new ImageIcon(Window.class.getResource("X.png"));
    private  static final ImageIcon ICON_O = new ImageIcon(Window.class.getResource("O.png"));
    private  static final ImageIcon ICON_DEFAULT = new ImageIcon(Window.class.getResource("def.png"));

    private final JButton[][] map = new JButton[3][3];
    private static int clickCount = 0;

    private void initMap(JPanel panel) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                JButton btn = map[i][j];
                btn.setIcon(ICON_DEFAULT);
                btn.setDisabledIcon(ICON_DEFAULT);
                btn.addActionListener(a -> {
                    btn.setIcon(ICON_X);
                    btn.setDisabledIcon(ICON_X);
                    btn.setEnabled(false);
                    clickCount++;
                    if (clickCount == 9) {
                        JFrame frame = new JFrame("Ничья");
                        frame.setSize(300, 100);
                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        JPanel p = new JPanel();
                        JButton close = new JButton("CLOSE");
                        close.addActionListener(e -> {
                            dispose();
                            frame.dispose();
                        });
                        JButton newGame = new JButton("NEW GAME");
                        newGame.addActionListener(e -> {
                            clickCount = 0;
                            new Window();
                            dispose();
                            frame.dispose();
                        });
                        p.add(close);
                        p.add(newGame);
                        frame.add(p);
                        frame.setVisible(true);
                    }
                    // TODO: 05.11.2020 move PC
                    // TODO: 05.11.2020 check victory
                });
                panel.add(btn);
            }
        }
    }

    public Window() throws HeadlessException {
        setSize(300, 300);
        // setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // ctrl + alt + v
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        System.out.println(toolkit.getScreenSize());
//        Dimension size = toolkit.getScreenSize();
//        setLocation(size.width / 2 - 150, size.height / 2 - 150);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("1");
        menu.add(new JMenuItem("1"));
        menu.add(new JMenuItem("2"));
        menu.add(new JMenuItem("3"));
        bar.add(menu);
        bar.add(new JMenu("2"));
        bar.add(new JMenu("3"));

        JPanel panel = new JPanel(new GridLayout(3,3));
        // panel.add(bar);
        initMap(panel);
        add(panel);
        //setMenuBar(bar);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
