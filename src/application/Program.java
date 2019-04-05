package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Programa para calcular duração de um jogo
		//O jogo pode começar em um dia e terminar em outro
		//Deve ter duração mínima de 1hora e máxima de 24horas
				
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
