import java.util.Locale;
import java.util.Scanner;
public class Exercicio_1014 {

	 public static void main(String[] args){
		        
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
		        
	 int x = sc.nextInt();
	 double y = sc.nextDouble();
		    
	 double quilometro = x / y;
	 System.out.printf("%.3f km/l%n", quilometro);
		    
		     
	 sc.close();
		        
		    }
		    
		}
	


