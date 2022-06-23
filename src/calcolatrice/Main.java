package calcolatrice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il primo numero (a)");
		int a = scan.nextInt();
		System.out.println("Inserisci il secondo numero (b)");
		int b = scan.nextInt();
		
		
	   System.out.println("Dimmi che operazioni vuoi fare: \n1. Somma \n2. Sottrazione \n3. Moltiplicazione \n4. Valore assoluto di A \n5. Minimo \n6. Massimo \n7. Potenza di (a) elevato (b) ");
	   int risposta = scan.nextInt();
	   
	   
	   
	   switch(risposta){
		   case 1:
			      System.out.println("Somma: " +CalcoliHelper.somma(a, b));
			      break;
		   case 2:
			      System.out.println("Sottrazione: "+CalcoliHelper.sottrazione(a, b));
			      break;
		   case 3:
				  System.out.println("Moltiplicazione: "+CalcoliHelper.molt(a, b));
				  break;
		   case 4:
				  System.out.println("Valore Assoluto di (a): "+CalcoliHelper.assoluto(a));
				  break;
		   case 5:
				  System.out.println(CalcoliHelper.min(a, b));
				  break;
		   case 6:
				  System.out.println(CalcoliHelper.max(a, b));
				  break;
		   case 7:
				  System.out.println(CalcoliHelper.potenza(a, b));
				  break;
				  
	   }
		
		scan.close();
	}

}
