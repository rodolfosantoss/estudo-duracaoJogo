package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Programa para calcular dura��o de um jogo
		//O jogo pode come�ar em um dia e terminar em outro
		//Deve ter dura��o m�nima de 1hora e m�xima de 24horas
				
			Scanner h = new Scanner(System.in);
				
				int horaI = h.nextInt();
				int horaF = h.nextInt();
				int duracao;
				
				if(horaI < horaF) {
					duracao = horaF - horaI;
					System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");
					
				}else {
					duracao = 24 - horaI + horaF;
					System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");
					
				}
				
				
			h.close();

	}

}
