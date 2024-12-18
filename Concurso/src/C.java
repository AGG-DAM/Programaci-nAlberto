import java.util.Scanner;

public class C {

    public static void cambioFilas (int [][] matriz, int fila1, int fila2) {
        int [] aux;
        aux = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = aux;
    }

    public static void esEmpate (int [][] matriz, int fila) {
        if(fila != 0){
            if(matriz[fila][0] == matriz[fila-1][0]) {
                if (matriz[fila][1] > matriz[fila-1][1]) {
                    cambioFilas(matriz, fila-1, fila);
                }
            }
        }
    }

    public static void muestramatriz (int [][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, n, h_temp, n_temp, genterecibe, sobrante;
        boolean swapped, salir = false;
        do {
            genterecibe = 0;
            sobrante = 0;

            h_temp = sc.nextInt();
            n_temp = sc.nextInt();
            if(n_temp!=0 && h_temp!=0) {
                h = h_temp;
                n = n_temp;
            }
            else
                break;
            int[][] nums = new int[n][2];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 2; j++) {
                        nums[i][j] = sc.nextInt();
                    }
                }

            for (int i = 0; i < n - 1; i++) { //ordena por prioridad
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (nums[j][0] > nums[j + 1][0]) {
                        cambioFilas(nums, (j + 1), j);
                        swapped = true;
                    }
                }
                // If no two elements were swapped, then break
                if (!swapped)
                    break;
            }

            for (int i = n - 1; i >= 0; i--) {
                esEmpate(nums, i);
                if ((h - nums[i][1]) >= 0) {
                    genterecibe++;
                    h -= nums[i][1];
                }else
                    break;
            }
            if(h==0 && n==0)
                salir = true;

            sobrante = h;
            System.out.println(genterecibe + " " + sobrante);
        }while(!salir);
    }
}
