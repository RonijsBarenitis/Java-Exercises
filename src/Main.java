public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo();
        Forma forma = new Forma();
        Triangolo triangolo = new Triangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();

    }
}