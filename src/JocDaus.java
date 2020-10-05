import java.util.Random;

public class JocDaus {

    private Dau dauA;
    private Dau dauB;
    private Dau dauC;

    private int victoria=0;

    public int getVictoria() {
        return victoria;
    }

    public JocDaus() {
        dauA = new Dau();
        dauB = new Dau();
        dauC = new Dau();
    }



    public void jugar(){

        Random rand = new Random();

        dauA.setValor(rand.nextInt(6)+1);
        dauB.setValor(rand.nextInt(6)+1);
        dauC.setValor(rand.nextInt(6)+1);

        System.out.println("\nDau 1: "+dauA.getValor()+"\nDau 2: "+dauB.getValor()+"\nDau 3: "+dauC.getValor()+"\n");

        if ((dauA.getValor() == dauB.getValor()) && (dauA.getValor() == dauC.getValor())){
            System.out.println("¡Has ganado el Dado!\n");
            victoria++;
        }
    }



}
