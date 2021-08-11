package program;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] temp = new int[6];

        for (int i = 0; i < temp.length; i++) {
            System.out.print("Digite a temperatura: ");
            temp[i] = sc.nextInt();
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 1; 6 > j; j++) {
                if (temp[j] < temp[j-1]) {
                    int aux = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = aux;
                }
            }
        }

        System.out.print(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] + " " +
                temp[4] + " " + temp[5]);

        sc.close();

    }
}
