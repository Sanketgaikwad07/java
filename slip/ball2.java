import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

class Ball {
    int x, y, diameter, xSpeed, ySpeed;
    Color color;

    public Ball(int x, int y, int diameter, int xSpeed, int ySpeed, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = color;
    }

    public void move(int panelWidth, int panelHeight) {
        if (x + xSpeed < 0 || x + diameter + xSpeed > panelWidth) {
            xSpeed = -xSpeed;  // Reverse direction if ball hits the window's sides
        }
        if (y + ySpeed < 0 || y + diameter + ySpeed > panelHeight) {
            ySpeed = -ySpeed;  // Reverse direction if ball hits the window's top/bottom
        }
        x += xSpeed;
        y += ySpeed;
    }
}

public class BallSimulation extends JPanel {
    private ArrayList<Ball> balls = new ArrayList<>();
    private Timer timer;
    private boolean isPaused = false;

    public BallSimulation() {
        setBackground(Color.BLACK);

        // Create a timer that updates the ball's position every 10ms
        timer = new Timer(10, e -> {
            if (!isPaused) {
                for (Ball ball : balls) {
                    ball.move(getWidth(), getHeight());
                }
                repaint();
            }
        });
        timer.start();

        // Mouse click listener to add new balls at mouse position
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                addRandomBall(e.getX(), e.getY());
            }
        });

        // Key listener to pause/resume the simulation when the spacebar is pressed
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    isPaused = !isPaused;  // Toggle pause/resume on spacebar press
                }
            }
        });
        setFocusable(true);  // Make sure the panel is focusable to capture keyboard
