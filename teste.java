import java.io.Console;
import java.util.Scanner;

public class teste {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int ano;
		int mes;
		int dia; 

		System.out.println("Digite quantos anos voce tem");		
		ano = sc.nextInt();
		
		System.out.println("Digite quantos meses voce tem para completar 1 novo ciclo de aniversario");
		mes = sc.nextInt();

		System.out.println("Digite quantos dias de vida voce tem para completar 1 novo ciclo de mesversario");
		dia = sc.nextInt();
				
		System.out.println(ano * 365 + mes * 30 + dia);
		
		System.out.println("Totais de dias vividos até hoje.");
	}
}