package com.poke;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class pokemon {

	private String Nome = "", retorno;
	public int Idade, codigo, codigoPesquisa;
	public double Peso = 0;

	public void setPokeCodigo() {

		retorno = JOptionPane.showInputDialog("digite o codigo do pokemon");
		if (retorno == null)
			System.exit(0);
		Pattern padrao = Pattern.compile("[\\d]");
		Matcher pesquisa = padrao.matcher(retorno);
		codigo = Integer.parseInt(retorno);
		if (!pesquisa.matches())
			throw new IllegalArgumentException("por favor digite um numero entre 1 - 151 ");

	}

	public void setpokeNome() {
		Nome = JOptionPane.showInputDialog("digite o nome do pokemon");
		if (Nome == null)
			System.exit(0);
		Pattern padrao = Pattern.compile("[\\d]+|[\\w]+");
		Matcher pesquisa = padrao.matcher(Nome);
		if (!pesquisa.matches())
			throw new IllegalArgumentException("Por Favor digite um nome valido ");
	}

	public void setpokeIdade() {
		retorno = JOptionPane.showInputDialog(null, "digite o idade do pokemon", "DADOS", JOptionPane.QUESTION_MESSAGE);
		if (retorno == null)
			System.exit(0);
		Pattern padrao = Pattern.compile("[\\d]+");
		Matcher pesquisa = padrao.matcher(retorno);
		Idade = Integer.parseInt(retorno);
		if (!pesquisa.matches())
			throw new IllegalArgumentException("Digite um idade valida maior ou igual 0");

	}

	public void setpokePeso() {
		retorno = JOptionPane.showInputDialog(null, "digite o peso do pokemon", "DADOS", JOptionPane.QUESTION_MESSAGE);
		if (retorno == null)
			System.exit(0);
		Pattern padrao = Pattern.compile("[\\d]+");
		Matcher pesquisa = padrao.matcher(retorno);
		Peso = Double.parseDouble(retorno);
		if (!pesquisa.matches())
			throw new IllegalArgumentException("Digite um Peso valia domaior ou igual 0");
	}

	public void setPokeCodigoPesquisa() {

		retorno = JOptionPane.showInputDialog("digite o codigo do pokemon que vc quer pesquisar");
		if (retorno == null)
			System.exit(0);
		Pattern padrao = Pattern.compile("[\\d]");
		Matcher pesquisa = padrao.matcher(retorno);
		codigoPesquisa = Integer.parseInt(retorno);
		if (!pesquisa.matches())
			throw new IllegalArgumentException("por favor digite um numero entre 1 - 151 ");

	}

	public int getPokeCodigo() {

		return codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public double getPeso() {
		return Peso;
	}

	public int getPokeCodigoPesquisa() {

		return codigoPesquisa;
	}

}
