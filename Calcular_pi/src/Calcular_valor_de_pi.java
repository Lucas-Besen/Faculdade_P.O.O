
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Calcular_valor_de_pi {
	
	public static void main(String[] args) {
		
	int j=1,termo=200000,x=0;
	double valorPi=0, numerador=4;
	DecimalFormat Casas = new DecimalFormat("0.00000");
	
		for(int i=1;i<=termo;i++) {
			
			if(i%2==1) {
				valorPi+=(numerador/j);
			}
				else if(i%2==0) {
				valorPi-=(numerador/j);
				}
		
			if("3,14159".equals( Casas.format(valorPi))){
				x=i;
				i=termo;
			}
			j+=2;
			
			System.out.println(Casas.format(valorPi));
			
		}
		
		System.out.println("\n"+x+" Essa foi a quantidade de termos utilizados para chegar no valor "+Casas.format(valorPi));


		
	
	}
}

