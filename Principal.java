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
			    "\n\n======= EDITOR DE ÁRVORE ======="
			+ "\n1 - INSERIR CADASTRO"
			+ "\n2 - REMOVER CADASTRO"
			+ "\n3 - PESQUISAR"
			+ "\n4 - ESVAZIAR TUDO"
			+ "\n5 - EXIBIR ÁRVORE"
			+ "\n0 - SAIR"
			+ "\n================================");
			n1 = teclado.nextInt();
	
			switch(n1) {
	
			case 1: 
				System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
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
				System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
				+ "\n  =DIGITE O RGM A SER REMOVIDO=");
				elem.setValor(teclado.nextInt());
				arvore = arvore.remover(elem);
				System.out.println("Elemento Removido!");
				break;
	
				
				
			case 3:	System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
					+ "\n =DIGITE O RGM A SER PESQUISADO=");

				boolean buscar = arvore.busca(teclado.nextInt());
				if (buscar == true) {
					System.out.println("\n\nO RGM pesquisado existe!");
				}
				if (buscar != true) {
					System.out.println("\n\nO RGM pesquisado não existe!");
				}
					break;
			
					
					
			case 4: System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
					+ "\n      = LISTA ESVAZIADA! =");
			
					arvore = null; 
			
					break;
			
					
					
			case 5: System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
					+ "\n       = EXIBIR ÁRVORE ="
					+ "\n  EXIBIR EM: 1 - PRÉ | 2 - IN | 3 - PÓS ");
			
					int ordem = teclado.nextInt();
					switch (ordem) {
					
					case 1:
						System.out.println("\nExibindo em Pré-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirPreOrdem(); //chamar a função de exibir em pré
						break;
						

					
					case 2: 
						System.out.println("\nExibindo em In-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirInOrdem(); //chamar a função de exibir em in
						break;
						
					case 3:
						System.out.println("\nExibindo em Pós-Ordem: \n");
						elem.setValor(0);
						arvore = arvore.remover(elem); 
						arvore.imprimirPosOrdem(); //chamar a função de exibir em pós
						break;
						
					
					
					default: System.out.println("Comando inexistente!");
					break;
		
					}
					break;
					
					
					
			case 0: System.out.println("\n\n\n======= EDITOR DE ÁRVORE ======="
					+ "\n    = PROGRAMA FINALIZADO! =");
					//chamar a função de esvaziar
					break;
					
					
			default: System.out.println("Comando inexistente!");
			break;
			}
	
		} while (n1 != 0);

		teclado.close();
    }
}
