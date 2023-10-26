public class Rettangolo extends Forma{

    private int altezza;
    private int lunghezza;

    public Rettangolo(int altezza, int lunghezza){
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    public Forme getForma(){
        Forme forma = Forme.rettangolo;
        return forma;
    }

    @Override
    public void calcolaArea() {
        int area = altezza * lunghezza;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo: " +area);
    }
}

