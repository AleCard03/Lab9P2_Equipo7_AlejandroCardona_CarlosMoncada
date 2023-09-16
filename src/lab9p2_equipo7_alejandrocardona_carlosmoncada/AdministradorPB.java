package lab9p2_equipo7_alejandrocardona_carlosmoncada;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class AdministradorPB extends Thread {

    private int delay;
    private JProgressBar pb;
    private boolean run;
    private boolean vivo;
    private String message;
    private JTextArea ta;
    private String imprimir;

    public AdministradorPB(int delay, JProgressBar pb, boolean run) {
        setVivo(true);
        this.delay = delay;
        this.pb = pb;
        this.run = run;
        this.ta = null;
        
    }

    public AdministradorPB(int delay, JProgressBar pb, boolean run, JTextArea ta, String imprimir) {
        this.delay = delay;
        this.pb = pb;
        this.run = run;
        this.ta = ta;
        this.imprimir = imprimir;
    }
    
    
    //delay -> 300 para 6 segundos

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public JProgressBar getPb() {
        return pb;
    }

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    
    
    @Override
    public void run() {
        setVivo(true);
        pb.setValue(0);
        
        while (run) {

            try {

                pb.setValue(pb.getValue() + 5);
                Thread.sleep(delay);
                if(pb.getValue()==100){
                    
                    run = false;
                    setVivo(false);
                    JOptionPane.showMessageDialog(null, message);
                    if(ta != null){
                        
                        ta.setText(imprimir);
                        
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
