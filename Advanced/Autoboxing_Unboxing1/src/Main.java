public class Main {
    public static void main(String[] args) {

        int int1 = 1;
        int int2 = 2;
        System.out.println("Sum of two ints: " +sumOfInts(int1, int2));

        char char1 = 'A';
        System.out.println("Printing a 'char': " +printChar(char1));

        Integer integer1 = 3;
        Integer integer2 = 4;
        System.out.println("Sum of two Integers: " +sumOfIntegers(integer1, integer2));

        Character character1 = 'B';
        System.out.println("Printing a 'Character': " +printCharacter(character1));

        int primitiveInt1 = 10;
        double primitiveDouble1 = 100.50;
        char primitiveChar1 = 'q';
        System.out.println("Values before autoboxing: " +primitiveInt1 +" " +primitiveDouble1 +" " +primitiveChar1);

        Integer objInt1 = primitiveInt1;
        Double objDouble1 = primitiveDouble1;
        Character objCharacter1 = primitiveChar1;
        System.out.println("Values after autoboxing: " +objInt1 +" " +objDouble1 +" " +objCharacter1);

        Integer objInt2 = 9;
        Double objDouble2 = 3.33;
        Character objCharacter2 = 'w';
        System.out.println("Values before unboxing: " +objInt2 +" " +objDouble2 +" " +objCharacter2);

        int primitiveInt2 = objInt2;
        double primitiveDouble2 = objDouble2;
        char primitiveChar2 = objCharacter2;
        System.out.println("Values after unboxing: " +primitiveInt2 +" " +primitiveDouble2 +" " +primitiveChar2);
    }

    public static int sumOfInts(int a, int b){
        return a+b;
    }

    public static char printChar(char a){
        return a;
    }

    public static Integer sumOfIntegers(Integer a, Integer b){
        return a+b;
    }

    public static char printCharacter(Character a){
        return a;
    }
}