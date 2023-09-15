package lab9p2_equipo7_alejandrocardona_carlosmoncada;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class AdministradorPB extends Thread {

    private int delay;
    private JProgressBar pb;
    private Color color;
    private boolean run;
    private String message;

    public AdministradorPB(int delay, JProgressBar pb, Color color, boolean run) {
        this.delay = delay;
        this.pb = pb;
        this.color = color;
        this.run = run;
    }
    //delay -> 300 para 6 segundos

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
    @Override
    public void run() {
        pb.setValue(0);
        pb.setBackground(color);
        while (run) {

            try {

                pb.setValue(pb.getValue() + 5);
                Thread.sleep(delay);
                if(pb.getValue()==100){
                    
                    run = false;
                    JOptionPane.showMessageDialog(null, message);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
