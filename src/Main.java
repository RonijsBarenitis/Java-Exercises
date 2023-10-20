public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mario", "Rossi", 12345);

        System.out.println("Nome dello studente: "+student1.getName());
        System.out.println("Cognome dello studente: "+student1.getSurname());
        System.out.println("Numero identificativo dello studente: "+student1.getIdNumber());

        student1.setName("Marco");
        student1.setSurname("Fortebraccio");
        student1.setIdNumber(54321);

        System.out.println("\nNome aggiornato dello studente: "+student1.getName());
        System.out.println("Cognome aggiornato dello studente: "+student1.getSurname());
        System.out.println("Numero identificativo aggiornato dello studente: "+student1.getIdNumber());


    }
}