package logica;

import igu.Pantalla;

/**
 *
 * @author jona
 */
public class Capas {
    
    public static void main(String[] args) {
        Pantalla ventana = new Pantalla();
        
        //Esta linea, llama a la ventana
        ventana.setVisible(true);
       
        //Esta linea abre la ventana en el centro de la pantalla
        ventana.setLocationRelativeTo(null);
        
        
    }
    
}
