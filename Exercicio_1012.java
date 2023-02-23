import java.util.Scanner;
import java.util.Locale;
public class Exercicio_1012 {

	  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  Locale.setDefault(Locale.US);

	  double a = sc.nextDouble();
	  double b = sc.nextDouble();
	  double c = sc.nextDouble();

	  double atriangulo = (a * c)/2;
	  System.out.printf("TRIANGULO: %.3f%n", atriangulo);

	  double PI = 3.14159;
	  double acirculo = PI*(c*c);
	  System.out.printf("CIRCULO: %.3f%n", acirculo );

	  double atrapezio = ((a + b)*c)/2;
	  System.out.printf("TRAPEZIO: %.3f%n", atrapezio);

	  double aquadrado = b*b;
	  System.out.printf("QUADRADO: %.3f%n", aquadrado);

	  double aretangulo = a*b;
	  System.out.printf("RETANGULO: %.3f%n", aretangulo);

	  sc.close();

	      }

	}