package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Problema "dados_pessoas"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		double menorAltura = 100.00;
		double maiorAltura = 0.00;
		int homens = 0;
		int mulheres = 0;
		double mediaAlturaH = 0.00;
		double mediaAlturaM = 0.00;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ",i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ",i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < n; i++) {
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				mulheres++;
				mediaAlturaM += altura[i];
			} else {
				homens++;
			}
		}
		
		System.out.printf("Menor altura = %.2f\n",menorAltura);
		System.out.printf("Maior altura = %.2f\n",maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n",mediaAlturaM / mulheres);
		System.out.printf("Numero de homens = %d",homens);
		
		sc.close();

	}

}
