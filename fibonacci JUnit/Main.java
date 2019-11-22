package loop_B;

import java.util.Scanner;

public class Main {
	//criar um codigo que faça a sequencia de fibonacci ate um determinado termo, e o termo tem que ser maior que 1, se for menor que 1 o resultado tem que ser 0.
	public static void main(String[] args) {
		
		Metodo calculo = new Metodo();
		Scanner scan = new Scanner(System.in);
		int termo=0;
		
		System.out.print("Digite a quantidade de termos que vc quer calcular\n");
		termo = scan.nextInt();
		
		calculo.setQuantidade(termo);
		
		 System.out.print(calculo.getUltimo());
		
		
	}
}
