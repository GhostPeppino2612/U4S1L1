import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ciao");
        int risultato = moltiplica(20, 30);
        System.out.println("Il risultato è: " + risultato);
        System.out.println("Il risultato è: " + concatena("ciaoo", 45));
        String[] inputArray = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        String newString = "NuovaStringa";
        String[] result = inserisciInArray(inputArray, newString);

            System.out.println(Arrays.toString(result));
    }
    public static int moltiplica(int num1, int num2) {
        return num1*num2;
    }
    public static String concatena(String stringa, int num) {
        return stringa + num;
    }
    public static String[] inserisciInArray(String[] inputArray, String newString) {
        String[] resultArray = new String[6];
        resultArray[2] = newString;
        resultArray[4] = inputArray[3];
        resultArray[5] = inputArray[4];
        return resultArray;

    }
}