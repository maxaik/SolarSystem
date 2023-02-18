import javax.swing.JFrame;

public class SystemFrame extends JFrame {
    
    SystemPanel panel;
    

    public SystemFrame(){

        panel = new SystemPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setTitle("Solar system");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}