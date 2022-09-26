import javax.swing.*;
import java.awt.Color;

class swing01 {
    public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        JLabel label = new JLabel("hola Java swing");
        JButton button = new JButton("boton");
        Color color = new Color(255,0,0);

        window.setBackground(Color.GRAY);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.setBounds(50, 50, 100, 40);
        window.add(button);
        window.add(label);
        window.setSize(400, 300);
        window.setVisible(true);
    }
}