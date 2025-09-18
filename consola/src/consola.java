import java.util.Random;
import java.util.Scanner;

public class consola {

        int n_palos = 21;
    public void iniciarJuego() {
    imprimir();
    while (n_palos >1) {
        turnoJugador();
        turnoMaquina();
    }
    perder();
    }
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        public void imprimir() {
            for (int i = 0; i < n_palos; i++) {
                System.out.print("|");
            }
        }


        public void turnoJugador(){

            System.out.println("\nCuantos palos deseas quitar?(solo podrás quitar de 1 a 4): ");
            int jugador = sc.nextInt();

            if (jugador >= 1 && jugador <= 4) {
                n_palos = n_palos - jugador;
            }

            this.imprimir();

        }

    public void turnoMaquina() {
        int n;
        int resto = (n_palos - 1) % 5;

        if (resto == 0) {

            n = random.nextInt(4) + 1;
        } else {
            n = resto;
        }

        System.out.println("\nLa máquina va a quitar *" + n + "* palos");

        n_palos -= n;
        this.imprimir();
    }


    public void perder(){
            System.out.println("\n\nHas perdido :)");
        }

}
