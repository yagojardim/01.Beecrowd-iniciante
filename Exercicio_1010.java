import java.util.Scanner;
import java.util.Locale;
public class Exercicio_1010 {

	   public static void main(String[] args){
		   
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);


        // leitura dos dados do produto 1
	    int codigo1 = sc.nextInt();
	    int quantidade1 = sc.nextInt();
	    double preco1 = sc.nextDouble();
	    sc.nextLine();

	    // leitura dos dados do produto 2
	    int codigo2 = sc.nextInt();
	    int quantidade2 = sc.nextInt();
	    double preco2 = sc.nextDouble();
	    sc.nextLine();

	    // cálculo do valor total a ser pago
	    double valorTotal = quantidade1 * preco1 + quantidade2 * preco2;

	    // exibição do resultado na tela
	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

	    sc.close();

	      }

	}