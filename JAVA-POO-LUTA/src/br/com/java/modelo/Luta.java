package br.com.java.modelo;

import java.util.Random;

import br.com.java.interfaces.LutaInterface;

public class Luta implements LutaInterface {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Construtor
	public Luta() {
		
	}

	public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
		super();
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}
	
	// Metodos Especiais

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	// Métodos Especiais
	@Override
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		// TODO Auto-generated method stub
		if (lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1 != lutador2)) {
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
			System.out.println("----------------------------------");
			System.out.println("         LUTA APROVADA            ");
			System.out.println("----------------------------------");
			
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("----------------------------------");
			System.out.println("         LUTA RECUSADA            ");
			System.out.println("----------------------------------");
		}
		
	}

	@Override
	public void lutar() {
		// TODO Auto-generated method stub
		if (this.aprovada) {
			System.out.println("----------------------------------");
			System.out.println("    APRESENTAÇÃO DO LUTADOR 1     ");
			System.out.println("###          DESAFIADO         ###");
			System.out.println("----------------------------------");
			this.desafiado.apresentar();
			
			System.out.println("----------------------------------");
			System.out.println("    APRESENTAÇÃO DO LUTADOR 2     ");
			System.out.println("###          DESAFIANTE        ###");
			System.out.println("----------------------------------");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			
			System.out.println("----------------------------------");
			System.out.println("       RESULTADO DA LUTA          ");
			System.out.println("----------------------------------");

			switch (vencedor) {
			case 0: // empate
				System.out.println("Empatou !");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
		
			case 1: // Desafiado vence
				System.out.println("O vencedor foi o lutador " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: // Desafiante Vence
				System.out.println("O vencedor foi o lutador " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;

			default:
				break;
			}
			
			System.out.println("----------------------------------");
			System.out.println("       CLASSE DO LUTADOR 1        ");
			System.out.println("----------------------------------");
			this.desafiado.status();
			
			System.out.println("----------------------------------");
			System.out.println("       CLASSE DO LUTADOR 2        ");
			System.out.println("----------------------------------");
			this.desafiante.status();
		}
		
	}
	
	
}
