import javax.swing.*;
import java.awt.*;

public class BallSimulation extends JPanel {
    private int x = 50;  // Ball's X position
    private int y = 50;  // Ball's Y position
    private int diameter = 30;  // Diameter of the ball
    private int xSpeed = 2;  // Speed of the ball along X axis
    private int ySpeed = 2;  // Speed of the ball along Y axis

    public BallSimulation() {
        Timer timer = new Timer(10, e -> moveBall());  // Timer to refresh the ball's position
        timer.start();
    }

    // Method to move the ball
    private void moveBall() {
        if (x + xSpeed < 0 || x + diameter + xSpeed > getWidth()) {
            xSpeed = -xSpeed;  // Reverse direction if ball hits the window's sides
        }
        if (y + ySpeed < 0 || y + diameter + ySpeed > getHeight()) {
            ySpeed = -ySpeed;  // Reverse direction if ball hits the window's top/bottom
        }
        x += xSpeed;
        y += ySpeed;
        repaint();  // Redraw the ball
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);  // Set ball color
        g.fillOval(x, y, diameter, diameter);  // Draw the ball
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Simulation");
        BallSimulation ballPanel = new BallSimulation();
        frame.add(ballPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
