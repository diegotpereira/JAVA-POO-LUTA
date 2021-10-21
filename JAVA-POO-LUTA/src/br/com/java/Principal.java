package br.com.java;

import br.com.java.modelo.Luta;
import br.com.java.modelo.Lutador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador lutador[] = new Lutador[6];
		lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		lutador[1] = new Lutador("Putscript","Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		lutador[2] = new Lutador("Snapshadow","EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		lutador[3] = new Lutador("Dead Code","Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		lutador[4] = new Lutador("UF0Cobol","Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		lutador[5] = new Lutador("Nerdaart","EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		 
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[0].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[0].status();
		
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[1].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[1].status();
		
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[2].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[2].status();
		
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[3].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[3].status();
		
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[4].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[4].status();
		
		System.out.println("                ");
		System.out.printf("Este é o: " );
		lutador[5].apresentar();
		
		System.out.println("                ");
		System.out.println("Com status: ");
		lutador[5].status();
		
		
		Luta luta = new Luta();
		luta.marcarLuta(lutador[4], lutador[5]);
		luta.lutar();

	}

}
