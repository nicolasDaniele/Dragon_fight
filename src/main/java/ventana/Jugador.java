package ventana;

import java.util.Random;

public class Jugador  {

    public static int vidaJugador = 200;
    public String evnt;
    
    public String ataqueStandar() {
        VentanaDragon vd = new VentanaDragon();
        Dragon dr2 = new Dragon();
        
        // Ataque Standar del jugador (15 puntos de daño, 80% de precisión)
        Random rand = new Random();
        int presicionJugador = rand.nextInt(100);
        if (presicionJugador > 20) {
            dr2.vidaDragon -= 15;
           evnt = "¡Atacaste al dragón! \nAl dragón le quedan " + dr2.vidaDragon + " puntos de vida";
        } else {
          evnt = "¡Fallaste!";
        }
        System.out.println(evnt);
        return evnt;
    }
}
