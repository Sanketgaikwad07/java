
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentRecordDisplay extends JFrame {
    private JTextField txtRNo, txtSName, txtPer;
    private JButton btnDisplay;

    public StudentRecordDisplay() {
        setTitle("Display Student Record");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Roll No:"));
        txtRNo = new JTextField();
        panel.add(txtRNo);

        panel.add(new JLabel("Student Name:"));
        txtSName = new JTextField();
        panel.add(txtSName);

        panel.add(new JLabel("Percentage:"));
        txtPer = new JTextField();
        panel.add(txtPer);

        btnDisplay = new JButton("Display First Record");
        btnDisplay.addActionListener(new DisplayButtonListener());
        panel.add(btnDisplay);

        add(panel);
    }

    private class DisplayButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Create connection to the PostgreSQL database
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/your_database", "username", "password");

                // Create a statement
                Statement stmt = conn.createStatement();

                // Execute a query to get the first record from the Student table
                ResultSet rs = stmt.executeQuery("SELECT * FROM Student LIMIT 1");

                // If result set has data, display it on the text fields
                if (rs.next()) {
                    String rno = rs.getString("RNo");
                    String sname = rs.getString("SName");
                    String per = rs.getString("Per");

                    txtRNo.setText(rno);
                    txtSName.setText(sname);
                    txtPer.setText(per);
                }

                // Close result set, statement, and connection
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(StudentRecordDisplay.this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentRecordDisplay frame = new StudentRecordDisplay();
            frame.setVisible(true);
        });
    }
}
