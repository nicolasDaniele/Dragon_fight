package ventana;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Dragon {

    public static int vidaDragon = 300;
    public String evnt;

  /*  public void ataqueDragon() {
        // Ataque delDragón(30 puntos de daño, 50% de precisión)
        //Si el jugador activa el escudo, el daño del dragón se reduce a la mitad

        Jugador jug2 = new Jugador();
        Timer timerDragon = new Timer();
        TimerTask ataque = new TimerTask() {
            @Override
            public void run() {
                if (VentanaDragon.resistencia > 0) { // Escudo activado
                    Random rand = new Random();
                    int presicionDragon = rand.nextInt(100);
                    if (presicionDragon > 50) {
                        jug2.vidaJugador -= 15;
                        evnt = "¡El dragón te atacó! \nTe quedan " + jug2.vidaJugador + " puntos de vida";
                        VentanaDragon.resistencia--;
                        if (VentanaDragon.resistencia == 0) {
                            evnt = "¡El escudo se destruyó!";
                        }
                    } else {
                        evnt = "¡El dragón intentó atacarte y falló! \nTe quedan " + jug2.vidaJugador + " puntos de vida";
                    }
                } else { // Escudo desactivado o destruído
                    Random rand = new Random();
                    int presicionDragon = rand.nextInt(100);
                    if (presicionDragon > 50) {
                        jug2.vidaJugador -= 30;
                        evnt = "¡El dragón te atacó! \nTe quedan " + jug2.vidaJugador + " puntos de vida";
                    } else {
                        evnt = "¡El dragón intentó atacarte y falló! \nTe quedan " + jug2.vidaJugador + " puntos de vida";
                    }
                }
                VentanaDragon vd = new VentanaDragon();
                // vd.lblEventos.setText(evnt);

            }
        };
        timerDragon.schedule(ataque, 30, 3000);
      //  System.out.println(evnt);
    }*/

}
