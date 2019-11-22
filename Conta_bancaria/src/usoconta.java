
import javax.swing.JOptionPane;

public class usoconta {

	public static void main(String[] args) {

		conta DadosConta = new conta();
		String nome;
		int escolha, escolha2;
		double deposito, saque=0;

		// nome
		nome = JOptionPane.showInputDialog(null, "Cliente, Qual é o seu nome ?", "DADOS", JOptionPane.QUESTION_MESSAGE);
		DadosConta.setNome(nome);

		// deposito inicial //verificaçao
		do {


			deposito = Double.parseDouble(JOptionPane.showInputDialog(null,
					DadosConta.getNome() + "\nFaça seu primeiro deposito podendo ser R$ 0", "DADOS",
					JOptionPane.QUESTION_MESSAGE));
			DadosConta.setDeposito(deposito);
			
			// verificaçao
			if (deposito < 0)
				JOptionPane.showMessageDialog(null, "DIGITE UM VALOR MAIOR OU IGUAL A 0 ", "ERRO",
						JOptionPane.ERROR_MESSAGE);

		} while (deposito < 0);

		do {
			String[] opt = { "Saldo", "Depositar", "Sacar", "Sair" };
			escolha = JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);

			switch (escolha) {
			
			// ver saldo
			case 0:
				JOptionPane.showMessageDialog(null, "Saldo Atual: \n " + DadosConta.getSaldo());
				break;

				// deposito
			case 1:
				do {

					deposito = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Digite o valor do deposito podendo ser maior R$ 0", "CONTA", JOptionPane.QUESTION_MESSAGE));
					DadosConta.setDeposito(deposito);

					// verificaçao do deposito
					if (deposito < 0)
						JOptionPane.showMessageDialog(null, "DIGITE UM VALOR MAIOR OU IGUAL A 0 ", "ERRO",
								JOptionPane.ERROR_MESSAGE);

				} while (deposito < 0);
				break;

				// saque
			case 2:
				do {

					if(saque<0) {
						JOptionPane.showMessageDialog(null, "DIGITE UM VALOR MAIOR QUE 0", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
					saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque ", "CONTA",
							JOptionPane.QUESTION_MESSAGE));

					// verificaçao do saque
					if (saque > DadosConta.getSaldo()) {
						JOptionPane.showMessageDialog(null, "DIGITE UM VALOR CORESPONDENTE AO SEU SALDO ", "ERRO",
								JOptionPane.ERROR_MESSAGE);

					}

				} while (DadosConta.getSaldo()<saque || saque<0);// verificaçao do saque
				// verificaçao do saque
				if (saque <= DadosConta.getSaldo()) {
					DadosConta.sacar(saque);
				}

				break;

				// sair
			default:
			}
			// verificacao para sair ou continuar
			if (escolha != 3) {
				String[] opt2 = { "Sim", "Nao" };
				escolha2 = JOptionPane.showOptionDialog(null, "Voce quer fazer outra açao", "OPÇOES",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt2, opt2[0]);
				switch (escolha2) {
				case 0:
					break;

				default:
					escolha = 3;
				}
			}

		} while (escolha != 3);// verificacao para sair
		JOptionPane.showMessageDialog(null,"Obrigado "+nome+", Volte Sempre!");
	}
}