package com.poke;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import com.pokedex.PokeBusca;

public class Main {

	public static void main(String[] args) throws MalformedURLException, IOException {

			
	
		
	PokeBusca buscaIcone = new PokeBusca();

		Perguntas Pergunta = new Perguntas();
		pokemon dados = new pokemon ();

		pokemon [] pokedados = new pokemon [151];
		
	
		
		boolean TesteErro =false;
		do{
			Pergunta.setOpcao();
	
			switch(Pergunta.getOpcao())
			{
				case 0:
					do {
						TesteErro =false;
						try{
							
							dados.setPokeCodigo();

						}
						catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);	
							TesteErro=true;
						}
						if(pokedados[dados.getPokeCodigo()]!=null) 
						{
							Pergunta.setOpcao2();
							switch (Pergunta.getOpcao2()) 
							{
								case 0:
									TesteErro =false;
									break;
								case 1:
									TesteErro=true;
									break;
								default:
									System.exit(0);
									break;
							}
						}
					}while(TesteErro==true);
				
				
					do{
						TesteErro=false;
						try{
							dados.setpokeNome();
						}
						catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);	
							TesteErro=true;		
						}
					}while(TesteErro==true);
	
					do{
						TesteErro=false;
						try{
							dados.setpokeIdade();
						}
						catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);	
							TesteErro=true;		
						}
					}while(TesteErro==true);
	
					do{
						TesteErro=false;
						try{
							dados.setpokePeso();
						}
						catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);	
							TesteErro=true;		
						}
					}while(TesteErro==true);
					
					pokedados[dados.getPokeCodigo()]=dados;
					
				break;
	
				case 1:
					try{
						
						dados.setPokeCodigo();
						
					}
					catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
						break;
					}
					if(pokedados[dados.getPokeCodigoPesquisa()]==null) 
					{
						JOptionPane.showMessageDialog(null,"nesse codigo infornado nao a pokemos","ERRO",JOptionPane.ERROR_MESSAGE);	

					}
					else if(pokedados[dados.getPokeCodigoPesquisa()]!=null) 
					{
						
						JOptionPane.showMessageDialog(null,pokedados[dados.getPokeCodigoPesquisa()].getNome()+"\n"+pokedados[dados.getPokeCodigoPesquisa()].getIdade()+"\n"+pokedados[dados.getPokeCodigoPesquisa()].getPeso(),"Título da Janela", JOptionPane.WARNING_MESSAGE);
					}
	
				break;
	
			}
		}while(Pergunta.getOpcao()!=2);
		
	}
}