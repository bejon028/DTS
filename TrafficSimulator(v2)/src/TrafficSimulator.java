import javax.swing.*;
/**
 * The master class of Traffic Simulator.
 * @author USER
 */
public class TrafficSimulator extends JApplet {
    /*
     * Traffic Simulator main entry point.Constructs GUI object.
     */
    public static void main(String[] args) {

        UserInterface bdy=new UserInterface();
        bdy.setSize(300,300);
        bdy.setLocation(150,40);
        bdy.setVisible(true);
        bdy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bdy.setResizable(false);
    }

}