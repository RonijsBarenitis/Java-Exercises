public class Triangolo extends Forma {

    private double altezza = 5;
    private double lunghezza = 4;
    @Override public void calcolaArea() {

        double areaTri = (altezza * lunghezza)/2;
        System.out.println("Risultato del metodo calcolaArea nella classe Triangolo, classe genitore Forma è astratta: " +areaTri);
    }
}