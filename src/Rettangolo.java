public class Rettangolo extends Forma{

    public int altezza = 5;
    public int lunghezza = 4;
    @Override
    public void calcolaArea() {
        int area = altezza * lunghezza;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo: " +area);
    }
}

