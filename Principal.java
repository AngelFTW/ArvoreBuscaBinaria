import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String response = null;
		int n1;
		Elemento elem = new Elemento(0);
		Arvore arvore = new Arvore(new Elemento(0));
		
		do {
			System.out.println(
			    "\n\n======= EDITOR DE �RVORE ======="
			+ "\n1 - INSERIR CADASTRO"
			+ "\n2 - REMOVER CADASTRO"
			+ "\n3 - PESQUISAR"
			+ "\n4 - ESVAZIAR TUDO"
			+ "\n5 - EXIBIR �RVORE"
			+ "\n0 - SAIR"
			+ "\n================================");
			n1 = teclado.nextInt();
	
			switch(n1) {
	
			case 1: 
				System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
						+ "\n        = DIGITE O RGM =");
				
				do {
		        	arvore.inserir(new Elemento(teclado.nextInt()));
		        	System.out.println("RGM Inserido!");
		        	System.out.println("Quer Adicionar outro?(s/n)");
		        	response = teclado.next();
		        	System.out.println("Digite o novo RGM");
		        	} while (!response.equals("n"));
				break;
	
				
				
			case 2: 
				System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
				+ "\n  =DIGITE O RGM A SER REMOVIDO=");
				elem.setValor(teclado.nextInt());
				arvore = arvore.remover(elem);
				System.out.println("Elemento Removido!");
				break;
	
				
				
			case 3:	System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
					+ "\n =DIGITE O RGM A SER PESQUISADO=");

				boolean buscar = arvore.busca(teclado.nextInt());
				if (buscar == true) {
					System.out.println("\n\nO RGM pesquisado existe!");
				}
				if (buscar != true) {
					System.out.println("\n\nO RGM pesquisado n�o existe!");
				}
					break;
			
					
					
			case 4: System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
					+ "\n      = LISTA ESVAZIADA! =");
			
					arvore = null; 
			
					break;
			
					
					
			case 5: System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
					+ "\n       = EXIBIR �RVORE ="
					+ "\n  EXIBIR EM: 1 - PR� | 2 - IN | 3 - P�S ");
			
					int ordem = teclado.nextInt();
					switch (ordem) {
					
					case 1:
						System.out.println("\nExibindo em Pr�-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirPreOrdem(); //chamar a fun��o de exibir em pr�
						break;
						

					
					case 2: 
						System.out.println("\nExibindo em In-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirInOrdem(); //chamar a fun��o de exibir em in
						break;
						
					case 3:
						System.out.println("\nExibindo em P�s-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirPosOrdem(); //chamar a fun��o de exibir em p�s
						break;
						
					
					
					default: System.out.println("Comando inexistente!");
					break;
		
					}
					break;
					
					
					
			case 0: System.out.println("\n\n\n======= EDITOR DE �RVORE ======="
					+ "\n    = PROGRAMA FINALIZADO! =");
					//chamar a fun��o de esvaziar
					break;
					
					
			default: System.out.println("Comando inexistente!");
			break;
			}
	
		} while (n1 != 0);

		teclado.close();
    }
}
