public class Auto {

    private final int cilindrata;

    private final String targa;

    private final String marca;

    private final String modello;

    public Auto(int cilindrata, String targa, String marca, String modello){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
