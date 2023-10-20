public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Lamborghini","Revuelto", 3, "AA000AA" );

        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Modello: "+auto1.getModello());
        System.out.println("Cilindrata: "+auto1.cilindrata);
        System.out.println("Targa: "+auto1.targa);

        auto1.setMarca("Porsche");
        auto1.setModello("911 GT3");
        auto1.cilindrata = 2;
        auto1.targa = "TF4U";

        System.out.println("\nMarca nuova: "+auto1.getMarca());
        System.out.println("Modello nuovo: "+auto1.getModello());
        System.out.println("Cilindrata nuova: "+auto1.cilindrata);
        System.out.println("Targa nuova: "+auto1.targa);
    }
}