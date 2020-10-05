import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JocDaus jocDaus = new JocDaus();

        int menu;
        int games=0;

        do{

            System.out.println("1. Jugar a los dados");
            System.out.println("2. Salir de los dados");

            menu = input.nextInt();

            switch(menu){
                case 1:
                    jocDaus.jugar();
                    games++;
                    break;
            }

        }while(menu!=2);

        System.out.println("\nHas jugado "+games+" partidas.");
        System.out.println("Has ganado un total de "+jocDaus.getVictoria()+" veces.");

        System.out.println("\nPorcentaje de victorias: "+jocDaus.getVictoria()*100/games);
    }
}
