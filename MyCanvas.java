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
        Paintbrush paintBrush = new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountains();
        paintBrush.drawTree();
    }
}
