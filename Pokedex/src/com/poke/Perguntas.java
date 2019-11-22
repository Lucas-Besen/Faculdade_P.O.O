package com.poke;

import javax.swing.JOptionPane;

public class Perguntas {

	private int OpcaoPricipal, OpcaoPricipal2;
	
	
	public void setOpcao() //primeira pergunta
	{
		String[] opt = { "cadastra", "pesquisa","sair" };
		OpcaoPricipal=JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
	}
	public void setOpcao2() //primeira pergunta
	{
		String[] opt = { "Atualizar", "usar outro codigo","sair" };
		OpcaoPricipal2=JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
	}
	
	public int getOpcao(){

		return OpcaoPricipal;
	}
	public int getOpcao2(){

		return OpcaoPricipal2;
	}
	


}

