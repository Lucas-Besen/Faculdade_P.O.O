package ContaBancaria;

public class conta {

	// variavel de instancia
	private String nome;
	private double saldo, saque;

	// metodo nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// metodo deposito inicial e deposito
	public void setDeposito(double deposito) {
		if (deposito >= 0)
			saldo += deposito;
	}

	// metodo ver o saldo
	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	// metedo saque
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
	}

}