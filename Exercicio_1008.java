import java.util.Scanner;
import java.util.Locale;
public class Exercicio_1008 {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		

		int NUMERO = sc.nextInt();
		int HTRABALHADAS = sc.nextInt();
		double VTRABALHADAS = sc.nextDouble();
		
		  
		          
		double salario = (HTRABALHADAS * VTRABALHADAS);
		
		System.out.println("NUMBER = " + NUMERO);
		System.out.println("SALARY = U$ " + salario);
		    
		sc.close();
		}
		}