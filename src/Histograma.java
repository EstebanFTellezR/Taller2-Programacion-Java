import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numeros, positivos = 0, negativos = 0;

        System.out.println("Ingrese números enteros y finalice con cero: ");

        do {
            numeros = sc.nextInt();

            if (numeros == 0){

            }else {
                if (numeros < 0) {
                    negativos++;
                } else {
                    positivos++;
                }
            }
        }while(numeros != 0);

        System.out.println("Positivos:");

        for (int i = 0;i<positivos;i++){
            System.out.print("*");
        }

        System.out.println();

        System.out.println("Negativos: ");

        for (int i = 0;i<negativos;i++){
            System.out.print("*");
        }
    }
}