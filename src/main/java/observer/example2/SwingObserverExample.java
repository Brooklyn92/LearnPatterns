package observer.example2;

import javax.swing.*;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton  button = new JButton("Should I do it");
        button.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(e -> System.out.println("Come on, do it"));
        jFrame.getContentPane().add(button);

//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
    }
}
