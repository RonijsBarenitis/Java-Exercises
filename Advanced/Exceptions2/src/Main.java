public class Main {
    public static void main(String[] args) {

        char myChar = 'y';
        System.out.println("The inserted character is: " +myChar);
        System.out.println("This function will check that character is a number");
        checkChar(myChar);
    }

    public static void checkChar(char a){

        boolean boolIsDigit = Character.isDigit(a);

        try{
            if(!boolIsDigit){
                throw new Exception("The character \"" +a +"\" is not a number");
            }
            else{
                System.out.println("The character inserted is a number.");
            }
        } catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}