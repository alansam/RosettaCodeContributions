
import java.awt.*;
import javax.swing.*;
 
public class RCuboid extends JFrame {
 
    public static void main(String[] args) {
        JFrame f = new RCuboid();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
 
    public RCuboid() {
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        content.add(new RCuboidPanel(), BorderLayout.CENTER);
        setTitle("RCuboid");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }
}
 
class RCuboidPanel extends JPanel {
 
    public RCuboidPanel() {
        setPreferredSize(new Dimension(600, 500));
        setBackground(Color.white);
    }
 
    @Override
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        g.translate(165, -80);
 
        g.drawRect(50, 275, 100, 100);
        g.drawLine(50, 275, 130, 240);
        g.drawLine(150, 275, 210, 240);
        g.drawLine(130, 240, 210, 240);
        g.drawLine(210, 240, 210, 340);
        g.drawLine(150, 375, 210, 340);
    }
}
