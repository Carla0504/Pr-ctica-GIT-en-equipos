import java.util.*;

public class Polvorones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int limiteMedico = teclado.nextInt();
            int tipos = teclado.nextInt();

            if (limiteMedico == 0 && tipos == 0) break;

            int[] limitesPersonales = new int[tipos];
            for (int i = 0; i < tipos; i++) {
                limitesPersonales[i] = teclado.nextInt();
            }

            int[] bandeja = new int[tipos];
            for (int i = 0; i < tipos; i++) {
                bandeja[i] = teclado.nextInt();
            }

            int totalComido = 0;
            boolean posible = true;

            for (int i = 0; i < tipos; i++) {
                if (bandeja[i] > limitesPersonales[i]) {
                    posible = false;
                    break;
                }
                totalComido += bandeja[i];
            }

            if (totalComido > limiteMedico) {
                posible = false;
            }

            System.out.println(posible ? "SI" : "NO");
        }

        teclado.close();
    }
}