import java.util.Scanner;
import java.util.Locale;
public class Exercicio_1009 {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			Locale.setDefault(Locale.US);
				

			String nomevendedor = sc.nextLine();
			double salfixo = sc.nextDouble();
			double vendfeitas = sc.nextDouble();
			
			  
			          
			double total01 = (vendfeitas * 0.15) + salfixo;
			
			System.out.printf("TOTAL = R$ %.2f%n", total01);

			sc.close();
			}
			

}
