package br.com.java.interfaces;

import br.com.java.modelo.Lutador;

public interface LutaInterface {
	
	// Todos m�todos s�o abstratos por defini��o sem necessidade de aprenta��o.
	public void marcarLuta(Lutador lutador1, Lutador lutador2);
	public void lutar();
}
