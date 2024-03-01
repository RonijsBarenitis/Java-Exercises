public class Rettangolo implements Forma{

    private int altezza;
    private int lunghezza;

    public Rettangolo(int altezza, int lunghezza){
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    @Override
    public void calcolaArea() {
        int area = altezza * lunghezza;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo: " +area);
    }
}

