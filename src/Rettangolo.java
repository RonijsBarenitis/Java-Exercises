public class Rettangolo implements Forma {

    private double altezza = 5;
    private double lunghezza = 4;
    public void calcolaArea() {

        double areaRett = altezza * lunghezza;
        System.out.println("Risultato del metodo calcolaArea nella classe Rettangolo, classe genitore Forma è un'interfaccia: " + areaRett);
    }

}