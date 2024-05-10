/*
Obj:
Crear un decodificador de código morse simple.

Características:
El código morse es sensible a mayúsculas.
1 espacio separa un carácter de otro.
3 espacios separa una palabra de otra.
Espacios antes o después del código no significan nada y deben ser ignorados.
Además, existen códigos de servicio especiales, el más notorio siendo SOS, codificado en morse como (...---...).

El código debe leer código morse y devolver un string para ser leído por un humano.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Please input the morse code you want to decode");
        var morseCode = teclado.nextLine();
        System.out.println(morseToEnglish(morseCode));
    }

    public static String decode(String morseCode) {
        String character = morseCode;

        if (morseCode.equalsIgnoreCase(".-"))
            character = "A";
        if (morseCode.equalsIgnoreCase("-..."))
            character = "B";
        if (morseCode.equalsIgnoreCase("-.-."))
            character = "C";
        if (morseCode.equalsIgnoreCase("-.."))
            character = "D";
        if (morseCode.equalsIgnoreCase("."))
            character = "E";
        if (morseCode.equalsIgnoreCase("..-."))
            character = "F";
        if (morseCode.equalsIgnoreCase("--."))
            character = "G";
        if (morseCode.equalsIgnoreCase("...."))
            character = "H";
        if (morseCode.equalsIgnoreCase(".."))
            character = "I";
        if (morseCode.equalsIgnoreCase(".---"))
            character = "J";
        if (morseCode.equalsIgnoreCase("-.-"))
            character = "K";
        if (morseCode.equalsIgnoreCase(".-.."))
            character = "L";
        if (morseCode.equalsIgnoreCase("--"))
            character = "M";
        if (morseCode.equalsIgnoreCase("-."))
            character = "N";
        if (morseCode.equalsIgnoreCase("---"))
            character = "O";
        if (morseCode.equalsIgnoreCase(".--."))
            character = "P";
        if (morseCode.equalsIgnoreCase("--.-"))
            character = "Q";
        if (morseCode.equalsIgnoreCase(".-."))
            character = "R";
        if (morseCode.equalsIgnoreCase("..."))
            character = "S";
        if (morseCode.equalsIgnoreCase("-"))
            character = "T";
        if (morseCode.equalsIgnoreCase("..-"))
            character = "U";
        if (morseCode.equalsIgnoreCase("...-"))
            character = "V";
        if (morseCode.equalsIgnoreCase(".--"))
            character = "W";
        if (morseCode.equalsIgnoreCase("-..-"))
            character = "X";
        if (morseCode.equalsIgnoreCase("-.--"))
            character = "Y";
        if (morseCode.equalsIgnoreCase("--.."))
            character = "Z";
        if (morseCode.equalsIgnoreCase("-----"))
            character = "0";
        if (morseCode.equalsIgnoreCase(".----"))
            character = "1";
        if (morseCode.equalsIgnoreCase("..---"))
            character = "2";
        if (morseCode.equalsIgnoreCase("...--"))
            character = "3";
        if (morseCode.equalsIgnoreCase("....-"))
            character = "4";
        if (morseCode.equalsIgnoreCase("....."))
            character = "5";
        if (morseCode.equalsIgnoreCase("-...."))
            character = "6";
        if (morseCode.equalsIgnoreCase("--..."))
            character = "7";
        if (morseCode.equalsIgnoreCase("---.."))
            character = "8";
        if (morseCode.equalsIgnoreCase("----."))
            character = "9";

        return character;
    }

    public static String morseToEnglish(String morseCode){
        String word = "";
        String selectedWord;
        String[] morseCharacters = morseCode.split(" ");

        for (int i = 0; i < morseCharacters.length; i++) {
            selectedWord = decode(morseCharacters[i]);


            word = word + selectedWord;
        }
        return word;
    }
}

