import javax.swing.*;

class Swing01 {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing");
        MyCanvaas canvaas = new MyCanvaas(); //dibujar lienzo de tono


        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Confiig.WINDOW_W, Confiig.WINDOW_H);
        window.add(canvaas);
        window.pack(); // establece el "tamaño del marco a los tamaños preferidos"
        window.setResizable(false);// No cambie el tamaño del marco del mouse blanco
        window.setLocationRelativeTo(null);// centro de la ventana

        window.setVisible(true);
        window.addKeyListener(canvaas);
    }
}