import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String msg;
		int x;
		Jogo Metodo = new Jogo();
		Perguntas Pergunta = new Perguntas();
		//Objeto criado

		do {	
			switch(x=Pergunta.PerguntaOpcao()) {
			case 0:
				//sozinho contraXPC
				do{
					JOptionPane.showMessageDialog(null, "Primeiro Jogador");
					Metodo.setPrimeiroJogador(Pergunta.PerguntaOpcao1());
					JOptionPane.showMessageDialog(null, "Computador");
					Metodo.setSegundoJogador(Metodo.GeraOpcao());
	
	
					if (Metodo.Empate()==true) {
						JOptionPane.showMessageDialog(null, "Empatou Jogue Novamente");
	
					}
	
				}while(Metodo.Empate()==true);
				break;
	
			case 1:
				//Jogador contra Jogador
				do{
					JOptionPane.showMessageDialog(null, "Primeiro Jogador");
					Metodo.setPrimeiroJogador(Pergunta.PerguntaOpcao1());
					JOptionPane.showMessageDialog(null, "Proximo Jogador");
					Metodo.setSegundoJogador(Pergunta.PerguntaOpcao1());
	
	
					if (Metodo.Empate()==true) {
						JOptionPane.showMessageDialog(null, "Empatou Jogue Novamente");
	
					}
	
				}while(Metodo.Empate()==true);
	
	
				break;
			}
			
			if(x==0){
			msg = "Jogador 1: "+Pergunta.Traduz(Metodo.getEscolha1()) +"\nComputador: "+Pergunta.Traduz(Metodo.getEscolha2());
			
				if (Metodo.VerificaJogador1Win())
				{
					JOptionPane.showMessageDialog(null, "O Primeiro Jogador Ganhou\n\n" + msg);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "O Computador Ganhou\n\n" + msg);
				}
			}
			
			else {
				msg = "Jogador 1: "+Pergunta.Traduz(Metodo.getEscolha1()) +"\nJogador 2: "+Pergunta.Traduz(Metodo.getEscolha2());
				
				if (Metodo.VerificaJogador1Win())
				{
					JOptionPane.showMessageDialog(null, "O Primeiro Jogador Ganhou\n\n" + msg);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "O Segundo Jogador Ganhou\n\n" + msg);
				}
		
			}
		}while(Pergunta.JogarNovamente()==1);	
	}

}


