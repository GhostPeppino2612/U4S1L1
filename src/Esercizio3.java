public class Esercizio3 {
    public static void main(String[] args) {
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(20.5, 23.4));
        // pariDispari(2);
        System.out.println("Il perimetro del triangolo è: " + perimetroTriangolo(20.5, 23.4, 27));
    }

    public static double perimetroRettangolo(double base, double altezza) {
        return (base + altezza) * 2;
    }

    /* public static int pariDispari(int num) {
         if (num / 2) {
             return 0;
         } else {
             return 1;
         }
     } */
    public static double perimetroTriangolo(double num1, double num2, double num3) {
        double p = (num1 + num2 + num3) / 2;
        double parziale = p * (p - num1) * (p - num2) * (p - num3);
        double area = Math.sqrt(parziale);
        return area;
    }
}
