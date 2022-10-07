import java.awt.Graphics;

public class Vehicles {
    private Graphics g;

    public Vehicles(Graphics g) {
        this.g = g;

    }

   
    public void drawPlane() {
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(150, 60, Confiig.SIZE_PLANE_CABINA_W, Confiig.SIZE_PLANE_CABINA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(200, 25, Confiig.SIZE_PLANE_ALA_W, Confiig.SIZE_PLANE_ALA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(170, 40, Confiig.SIZE_PLANE_BASE_W, Confiig.SIZE_PLANE_BASE_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(165, 40, Confiig.SIZE_PLANE_HELICE_W, Confiig.SIZE_PLANE_HELICE_H);

    }
    

}