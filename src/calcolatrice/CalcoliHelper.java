package calcolatrice;


public class CalcoliHelper {
	
	private CalcoliHelper() {
		
	}

	public static int somma(int a, int b) {
		return a+b;
	}
	
    public static int sottrazione(int a, int b) {
		return a-b;
	}
   
	public static int molt(int a, int b) {
		return a*b;
	}

	public static int assoluto(int a) {
		return Math.abs(a);
	}
	
	public static String max(int a, int b) {
		if(a > b) {
		return "Il numero maggiore è: " +a;
		}
		if(a == b) {
		return " I numeri sono uguali ";	
		} else
		return "Il numero maggiore è: " +b;
		
		
	}
	
	public static String min(int a, int b) {
		if(a > b) {
		return "Il numero minore è: " +b;
		}
		if(a == b) {
		return " I numeri sono uguali ";	
		} else
		return "Il numero minore è: " +a;
	}
	
	
	public static int potenza(int a, int b) {
		int risultato = a;
		
		if (b == 0) {
			System.out.print("Il valore di un numero elevato a 0 restituisce sempre ");	
			return 1;
		}
		else 
		  for (int i=1; i < b; i++) {
			risultato = risultato * a;	
		}
		return risultato;


	}

}
