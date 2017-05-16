package rectangulo;

/*
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
 */
public class Rectangulo {

    public static void main(String[] args) {

        Punto punto_2 = new Punto(3, 1);
        Punto punto_3 = new Punto(1, 3);
        //Punto aux = new Punto(3, 1);
        Rect rect = new Rect(punto_2, punto_3);
        
        Rect aux = new Rect(new Punto(3, 0), new Punto(1, 2));
        System.out.println("Area del original: " + rect.calculateArea());
        System.out.println("Area de la colision: " + rect.calculateAreaOfcollision(aux));
        //System.out.println(rect.isInTheRect(aux));

        /*
        DrawRect draw_rect = new DrawRect();
        draw_rect.setRECT_X((int) r3ct.getX_y_1().getX());
        draw_rect.setRECT_Y((int) r3ct.getX_y_1().getY());
        draw_rect.setRECT_WIDTH((int) r3ct.calculateWidth());
        draw_rect.setRECT_HEIGHT((int) r3ct.calculateHeight());
        
        draw_rect.draw();
         */
    }

}
/*
class DrawRect extends JPanel {

    private int RECT_X;
    private int RECT_Y;
    private int RECT_WIDTH;
    private int RECT_HEIGHT;

    public void setRECT_X(int RECT_X) {
        this.RECT_X = RECT_X;
    }

    public void setRECT_Y(int RECT_Y) {
        this.RECT_Y = RECT_Y;
    }

    public void setRECT_WIDTH(int RECT_WIDTH) {
        this.RECT_WIDTH = RECT_WIDTH;
    }

    public void setRECT_HEIGHT(int RECT_HEIGHT) {
        this.RECT_HEIGHT = RECT_HEIGHT;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the rectangle here
        g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    }

    // create the GUI explicitly on the Swing event thread
    private static void createAndShowGui() {
        DrawRect mainPanel = new DrawRect();

        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void draw() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
}
 */
