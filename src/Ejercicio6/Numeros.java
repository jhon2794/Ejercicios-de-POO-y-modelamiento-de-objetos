package Ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Numeros {
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    public Numeros() {

    }

    public void arrayDinamico(){
        Scanner sc = new Scanner(System.in);
        int num = 1, aux = 0, contador =0;
      while (aux!=num){
          num = Integer.valueOf(sc.nextLine());
          numeros.add(num);
          if(contador!=0){
              aux = numeros.get(contador-1);
          }
          contador++;

      }
      for (int i = 0; i<numeros.size();i++){
          System.out.println(numeros.get(i));
      }

    }

}
