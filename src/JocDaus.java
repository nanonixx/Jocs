import java.util.Random;
import java.util.Scanner;

public class JocDaus {


    public void joc(){

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int dadoA, dadoB;
        int total;

        int c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0, c10=0, c11=0, c12 = 0;

        System.out.println("Quantes vegades vols llençar els daus?");
        int N = input.nextInt();
        System.out.println("Llançament...");

        for (int i = 0; i < N; i++) {

            dadoA = rand.nextInt(6)+1;
            dadoB = rand.nextInt(6)+1;

            total = dadoA + dadoB;

            if (total==2) c2++;
            if (total==3) c3++;
            if (total==4) c4++;
            if (total==5) c5++;
            if (total==6) c6++;
            if (total==7) c7++;
            if (total==8) c8++;
            if (total==9) c9++;
            if (total==10) c10++;
            if (total==11) c11++;
            if (total==12) c12++;
        }

        System.out.println("Resultat");
        System.out.println("2-->  "+c2+" vegades");
        System.out.println("3-->  "+c3+" vegades");
        System.out.println("4-->  "+c4+" vegades");
        System.out.println("5-->  "+c5+" vegades");
        System.out.println("6-->  "+c6+" vegades");
        System.out.println("7-->  "+c7+" vegades");
        System.out.println("8-->  "+c8+" vegades");
        System.out.println("9-->  "+c9+" vegades");
        System.out.println("10-->  "+c10+" vegades");
        System.out.println("11-->  "+c11+" vegades");
        System.out.println("12-->  "+c12+" vegades");
    }

}
