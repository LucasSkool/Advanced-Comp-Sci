import javax.swing.JFrame;

public class MyFrame extends JFrame {
    private MyPanel panel;
    private MyPanel panel2;

    public MyFrame(){
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
       
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //another panel? idk doesnt work rn
        panel2 = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel2);
        this.pack();
       
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


   
}