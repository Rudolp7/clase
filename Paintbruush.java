import java.awt.Graphics;
import java.awt.Polygon;


public class Paintbruush {
    private Graphics g;

    public Paintbruush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(Confiig.COLOR_SKY);
        g.fillRect(Confiig.SKY_X, Confiig.SKY_Y, Confiig.SKY_W, Confiig.SKY_H);
    }

    // sun
    public void drawSun(Point p) {

        g.setColor(Confiig.COLOR_SUN);
        g.fillOval(p.getX(), p.getY(), Confiig.SUN_SIZE, Confiig.SUN_SIZE);
    }

    // lake
    public void drawLake() {
        g.setColor(Confiig.COLOR_LAKE);
        g.fillRect(Confiig.LAKE_X, Confiig.LAKE_Y, Confiig.LAKE_W, Confiig.LAKE_H);
    }

    // mountains
    public void drawMountains(int x1,int y1,int x2,int y2,int x3,int y3) {
        Polygon triangle = new Polygon();
      
        triangle.addPoint(x1,y1);
        triangle.addPoint(x2,y2);
        triangle.addPoint(x3,y3);
        g.setColor(Confiig.COLOR_BROWN);
        g.fillPolygon(triangle);
    }

    // tree
    public void drawTree(int start, int top) {

        // draw trunk´s
        g.setColor(Confiig.COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 110, 26, 40);
        // draw tree's

        g.setColor(Confiig.COLOR_TREE);
        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width / 2), top + height + (spacing * i));
            triangle.addPoint(start + (width / 2), top + height + (spacing * i));

            g.fillPolygon(triangle);
        }

    }
}