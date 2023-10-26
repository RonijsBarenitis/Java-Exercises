public class Triangolo extends Forma{
    private int altezza = 5;
    private int lunghezza = 4;
    @Override
    public void calcolaArea() {
        int areaTri = (altezza * lunghezza)/2;
        System.out.println("Risultato del metodo calcolaArea nella classe Triangolo: " +areaTri);
    }
}