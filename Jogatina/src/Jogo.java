public class Jogo {
	private int escolha1 = -1, escolha2 = -1;
	private boolean ganhou, empatou;
	
	public void setPrimeiroJogador(int escolha1) {
		this.escolha1 = escolha1;
	}
	//Recebe o Valor da escolha do primeiro jogador
	
	public void setSegundoJogador(int escolha2) {
		this.escolha2 = escolha2;
	}
	//Recebe o Valor da escolha do Segundo jogador
	
	public int getEscolha1() {
		return escolha1;
	}

	public int getEscolha2() {
		return escolha2;
	}
	


	public boolean VerificaJogador1Win() {
		if (escolha1 == 0 && escolha2 == 2) {
			// Pedra(jogador1) e Tesoura(Jogador2)
			ganhou = true;
		} else if (escolha1 == 1 && escolha2 == 0) {
			// Papel(jogador1) e Pedra(Jogador2)
			ganhou = true;
		} else if (escolha1 == 2 && escolha2 == 1) {
			// Tesoura(jogador1) e Papel (Jogador2)
			ganhou = true;
		} 
		else
			ganhou = false;

		return ganhou;
	}
	//Verefica se o jogador 1 ganhou se nao obviamente o jogador2 ganha
	public boolean Empate() {
		if (escolha1 == escolha2) {

			empatou = true;
			escolha1 = -1;
			escolha2 = -1;
		} else
			empatou = false;

		return empatou;
	}
	//Em Caso de Empate retorna esse metodo ao main

	
	public int GeraOpcao() {
		double numero = Math.random();
		//cria um numero double entre 0 a 1
		int numInt = (int)Math.floor(numero*10);
		//multiplica por 10 e transforma em inteiro
		int escolha = numInt%3;
		// O modulo garante os numeros gerados sendo 0 a 2 são 3 opções
			
		return escolha;
	}
	//Gera a opcao do pc

}
