public class Rettangolo extends Forma{

    private int altezza = 5;
    private int lunghezza = 4;

    public Forme getForma(){
        Forme forma = Forme.rettangolo;
        return forma;
    }
    @Override
    public void calcolaArea() {
        int areaRett = altezza * lunghezza;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo: " +areaRett);
    }
}
