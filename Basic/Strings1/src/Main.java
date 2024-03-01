public class Main {
    public static void main(String[] args) {

        String string = "1 2 3 a b c ? ! # @";
        int indexPos = 16;
        stringCharToUnicode(string, indexPos);
    }

    public static int stringCharToUnicode(String str, int pos){

        if(pos < 0 || pos >= str.length()){

            StringBuilder errorMsg = new StringBuilder();
            errorMsg.append("Error, indexPos of " +pos +" is out of bounds for string \"" +str +"\" of length of " +str.length());
            errorMsg.append("\nIndexing starts at position 0, so the first element of the string has the position 0.");
            errorMsg.append("\nIndexes of string \""+str+"\" go from 0 to "+(str.length()-1));
            System.out.println(errorMsg);

            return 0;
        }

        char charAtIndex = str.charAt(pos);

        StringBuilder result = new StringBuilder();

        result.append("The unicode value of character \"" +charAtIndex +"\" is: ");
        result.append("\\u+" + Integer.toHexString(charAtIndex | 0x10000).substring(1));
        
        System.out.println(result);


        return 1;
    }
}