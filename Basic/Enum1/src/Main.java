public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5,4);
        Triangolo triangolo = new Triangolo(5,4);

        forma.calcolaArea();

        rettangolo.calcolaArea();
        System.out.println("Forma: " +rettangolo.getForma());

        triangolo.calcolaArea();
        System.out.println("Forma: " +triangolo.getForma());

    }
}