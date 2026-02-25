import java.util.Scanner;

public class guia1{
   public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Cuantos alumnos: ");
    int cantidad = sc.nextInt();

    for(int i =1; i<= cantidad; i++) {

        System.out.println("Digite el peso; ");
        int peso= sc.nextInt();

        if (peso < 40){
        System.out.println("Menos de 40 kg");
        }else{
        if (peso >= 40 && peso<50){
            System.out.println("entre 40 y 50 kg");
        }else{
            if (peso >= 50 && peso <60){
            System.out.println("mas de 50 kg y menos de 60kg");
        }else{
            System.out.println("mas o igual a 60 kg");
        }
    }
}
    }

   sc.close();  
   } 
}