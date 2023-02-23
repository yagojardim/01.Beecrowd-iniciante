import java.util.Scanner;
import java.util.Locale;
public class Exercicio_1011 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
		
	double r = sc.nextDouble();
		  
	double PI = 3.14159;
	double esfera =(4/3.0) * PI*(r*r*r);
	System.out.printf("VOLUME = %.3f%n", esfera );

	}

}
