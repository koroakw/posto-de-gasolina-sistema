package exercicios;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		int cod, alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- MAQUININHA DO NANDO'S GAS STATION ---------");
		System.out.println("--------- CÓDIGO DOS SEGUINTES ITENS:  1.ÁLCOOL 2.GASOLINA 3.DIESEL 4.FIM ---------");
		System.out.println("--------- FIQUE A VONTADE PARA ESCOLHER QUAIS E QUANTOS QUISER ---------");
		cod = sc.nextInt();
		while (cod!=4) {
			if (cod == 1) {
				alcool += 1;
				cod = sc.nextInt();
			} else if (cod == 2) {
				gasolina += 1;
				cod = sc.nextInt();
			} else if (cod == 3) {
				diesel += 1;
				cod = sc.nextInt();
			} else {
				cod = sc.nextInt();
			}

		}
		System.out.println("--------- MUITO OBRIGADO ---------");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);

		sc.close();

	}

}
