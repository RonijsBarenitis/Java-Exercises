public class Triangolo extends Forma{

    private double altezza;
    private double lunghezza;

    public Triangolo(int altezza, int lunghezza){
        this.altezza = altezza;
        this.lunghezza = lunghezza;
    }

    public Forme getForma(){
        Forme forma = Forme.triangolo;
        return forma;
    }

    @Override
    public void calcolaArea() {
        double area = (altezza * lunghezza)/2;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo: " +area);
    }
}

