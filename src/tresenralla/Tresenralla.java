package tresenralla;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tresenralla {
    private static BufferedReader pantalla = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args) throws IOException {
       
        int fila ,columna, contadorempate= 0;
       boolean valor = true;
        char[][] tablero = new char[3] [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] ='-';
            }
         }
        do {

        do {
            
            System.out.println("jugador1 , introduce datos:");
            System.out.println("jugador 1 introduce fila");
            fila = (Integer.parseInt(pantalla.readLine()))-1;
            System.out.println("jugador 1 introduce columna");
            columna = (Integer.parseInt(pantalla.readLine()))-1;
            
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = 'O';
                valor = true ;
             } else
             System.out.println("ocupado");   
            
        } while (valor == false);
            
        for (int i = 0; i < 3; i++) {
                for (int q = 0; q < 3; q++) {
                    System.out.print(tablero[i][q]+"  ");
                }
                System.out.println("");
              }
        contadorempate++;
        if (contadorempate == 9) {
            System.out.println("Empate");
            break;  
        }
        if ( tablero [0][0] == tablero [0][1] && tablero [0][0] == tablero [0][2] && tablero [0][0] == 'O' ) {
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if( tablero [0][0] == tablero [1][0] && tablero [0][0] == tablero [2][0] && tablero [0][0] == 'O' ) {
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if ( tablero [0][1] == tablero [1][1] && tablero [0][1] == tablero [1][2] && tablero [0][1] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if( tablero [1][0] == tablero [1][1] && tablero [1][0] == tablero [2][1] && tablero [1][0] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if ( tablero [0][2] == tablero [1][2] && tablero [0][2] == tablero [2][2] && tablero [0][2] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if( tablero [2][0] == tablero [2][1] && tablero [2][0] == tablero [2][2] && tablero [2][0] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if ( tablero [0][0] == tablero [1][1] && tablero [0][0] == tablero [2][2] && tablero [0][2] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }
        if( tablero [0][2] == tablero [1][1] && tablero [0][2] == tablero [2][0] && tablero [2][0] == 'O' ){
            System.out.println("Jugador 1 ha ganado");
            break;
        }

        //jugador 2
        valor = false;
         do {
            
            System.out.println("jugador2 , introduce datos:");
            System.out.println("jugador 2 introduce fila");
            fila = (Integer.parseInt(pantalla.readLine()))-1;
            System.out.println("jugador 2 introduce columna");
            columna = (Integer.parseInt(pantalla.readLine()))-1;
            
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = 'X';
                valor = true ;
             } else
             System.out.println("ocupado");   
            
        } while (valor == false);
            
        for (int i = 0; i < 3; i++) {
                for (int q = 0; q < 3; q++) {
                    System.out.print(tablero[i][q]+"  ");
                }
                System.out.println("");
              }    
        contadorempate++;
if ( tablero [0][0] == tablero [0][1] && tablero [0][0] == tablero [0][2] && tablero [0][0] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if( tablero [0][0] == tablero [1][0] && tablero [0][0] == tablero [2][0] && tablero [0][0] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if ( tablero [0][1] == tablero [1][1] && tablero [0][1] == tablero [2][1] && tablero [0][1] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if( tablero [1][0] == tablero [1][1] && tablero [1][0] == tablero [2][1] && tablero [1][0] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if ( tablero [0][2] == tablero [1][2] && tablero [0][2] == tablero [2][2] && tablero [0][2] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if( tablero [2][0] == tablero [2][1] && tablero [2][0] == tablero [2][2] && tablero [2][0] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if ( tablero [0][0] == tablero [1][1] && tablero [0][0] == tablero [2][2] && tablero [0][2] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        if( tablero [0][2] == tablero [1][1] && tablero [0][2] == tablero [2][0] && tablero [2][0] == 'X' ){
            System.out.println("Jugador 2 ha ganado");
            break;
        }
        } while (contadorempate <9);
  }
}
