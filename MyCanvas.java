import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;


public class MyCanvas extends JPanel {
    public MyCanvas () {
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.GRAY);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color (127,233,245));
        g.fillRect(0,0, 400, 100);

        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 20, 20);
    }
}
