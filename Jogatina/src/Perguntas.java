import javax.swing.JOptionPane;

public class Perguntas {

	private String NomedaJogada;
	public int PerguntaOpcao() {
		String[] opt = { "Jogador X PC", "Jogador X Jogador" };
		return JOptionPane.showOptionDialog(null, "Escolha umas das op�oes para continuar", "OP�OES",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
	}
	//Metodo para a pergunta das op��es do jogo
 
	public int PerguntaOpcao1() {
		String[] opt1 = { "Pedra", "Papel", "Tesoura" };
		return JOptionPane.showOptionDialog(null, "Escolha umas das op�oes para continuar", "OP�OES",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt1, opt1[0]);
	}
	
	public int JogarNovamente() {
		String[] opt1 = { "sair", "Novamente", };
		return JOptionPane.showOptionDialog(null, "Voce quer jogar Novamente ?", "OP�OES",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt1, opt1[0]);
	}
		
	//Metodo para a pergunta das op��es do jogo
	public String Traduz(int escolha) {
		
		switch(escolha) {
		case 0:
			NomedaJogada=" Pedra";
			break;
		case 1:
			NomedaJogada=" Papel";
			break;
		case 2:
			NomedaJogada=" Tesoura";
			break;
		}
		return NomedaJogada;

	}

	
}
