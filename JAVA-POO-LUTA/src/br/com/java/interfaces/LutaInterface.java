package br.com.java.interfaces;

import br.com.java.modelo.Lutador;

public interface LutaInterface {
	
	// Todos métodos são abstratos por definição sem necessidade de aprentação.
	public void marcarLuta(Lutador lutador1, Lutador lutador2);
	public void lutar();
}
