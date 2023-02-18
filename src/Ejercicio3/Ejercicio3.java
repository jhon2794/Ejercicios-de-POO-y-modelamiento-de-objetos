package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

 private double [] numeros;
    public Ejercicio3() {
        super();
    }
    public double[] generarArrayNumeros(int tamanioArray){
       numeros = new double[tamanioArray];
        for (int i =0; i < numeros.length;i++){
            if (i%2==0){
              numeros[i] =  (int) (Math.random()*50+(-20));
            }else {
                numeros[i] = Math.random()*16-10;
            }
        }
        return numeros;
    }
    public double [] burbuja(double[] A) {
         int i, j;
         double aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (Double.compare(A[j + 1],A[j])< 0) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
    public double[] quicksort(double A[], int izq, int der) {
        double pivote=A[izq];
        int i=izq;
        int j=der;
        double aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++;
            while(A[j] > pivote) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[izq]=A[j];
        A[j]=pivote;
        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);
        return A;
    }

    public  void usuario(){
        Scanner sc = new Scanner(System.in);
        int response = 0;
        int tamanioArrelgo = 0;
        System.out.println("elija el tamaño del arreglo");
        tamanioArrelgo = Integer.valueOf(sc.nextLine());
       double [] numeros = generarArrayNumeros(tamanioArrelgo);
        for (int i = 0; i < numeros.length;i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Selecciona la opción deseada:");
        System.out.println("---------------------------");
        System.out.println("1.ordenar por metodo burbuja");
        System.out.println("2.ordenar por metodo quickshort");
        response = Integer.valueOf(sc.nextLine());
        switch (response) {
            case 1:
                burbuja(numeros);
                for (int i = 0; i < numeros.length;i++){
                    System.out.println(numeros[i]);
                }
                break;
            case 2:
                quicksort(numeros,0,tamanioArrelgo-1);
                for (int i = 0; i < numeros.length;i++){
                    System.out.println(numeros[i]);
                }
                break;
            default:
                System.out.println("Ingresa un valor correcto");
        }

    }
}
