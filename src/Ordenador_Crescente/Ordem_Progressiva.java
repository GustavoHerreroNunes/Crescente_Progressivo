/* Este c�digo visa receber 10 valores e realizar uma
 * organiza��o crescente destes e mostrar em tempo real 
 * ao usu�rio 		
 */

package Ordenador_Crescente;

import javax.swing.JOptionPane;

public class Ordem_Progressiva {

	public static void main(String[] args) {
		int Num[] = new int[10], Troca =0;
		
		//Recebimento dos 10 n�meros
		for(int x =0; x <10; x++) {
			Num[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (x+1) + "� valor do array:", "OrdenadorArray", 3));
		}
		
		//Informando primeira ordem, a informada ao usu�rio, para que assim possa acompanhar bem as altera��es nessa ordem
		JOptionPane.showMessageDialog(null, "Ordem Atual: " + Num[0] + " " + Num[1] + " " + Num[2] + " " + Num[3] + " " + Num[4] + " " + Num[5] + " " + Num[6] + " " + Num[7] + " " + Num[8] + " " + Num[9], "OrdenadorArray", 2);
		
		
		//Caso algum qualquer valor Y tiver um sucessor menor que ele se� necessaria uma nova organiza��o 
		while(Num[1]< Num[0] ||Num[2]< Num[1] ||Num[3]< Num[2] ||Num[4]< Num[3] ||Num[5]< Num[4] ||Num[6]< Num[5] ||Num[7]< Num[6] ||Num[8]< Num[7] ||Num[9]< Num[8]) {
			for(int y =0; y <=9; y++) {
				if(y==9) {//Caso estejamos verificando a �ltima posi��o do vetor n�o h� necessidade de verificar, pois n�o h� sucessor
				}
				else if(Num[y+1] < Num[y]) {//Verifica��o do sucessor(Verdadeira: troca dos valores de suas respectivas posi��es
					Troca = Num[y+1];
					Num[y+1] = Num[y];
					Num[y]= Troca;
					
					//Linha abaixo informa qual � a atual� ordem para o usu�rio verificar mudan�a � mudan�a. PS: Poderia ser retirada sem problemas caso n�o optasse por informar ao usu�rio
					JOptionPane.showMessageDialog(null, "Ordem Atual: " + Num[0] + " " + Num[1] + " " + Num[2] + " " + Num[3] + " " + Num[4] + " " + Num[5] + " " + Num[6] + " " + Num[7] + " " + Num[8] + " " + Num[9], "OrdenadorArray", 2);
				}
			}
		}
		
		//Informa ordem final das posi��es
		JOptionPane.showMessageDialog(null, "Ordem Final: " + Num[0] + " " + Num[1] + " " + Num[2] + " " + Num[3] + " " + Num[4] + " " + Num[5] + " " + Num[6] + " " + Num[7] + " " + Num[8] + " " + Num[9], "OrdenadorArray", 1);
		

	}

}
