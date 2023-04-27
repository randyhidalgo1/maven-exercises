
public class MavenExercise {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}


//    Create a new class with a main method that prompts the user for input
//    and does the following (using the StringUtils class)
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//        Example Console Output
//
//
//        Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL