package kreis.aula;
import java.util.ArrayList;
import java.util.Collections;

public class MaioresValores {
	
	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(5);
        lista.add(8);
        lista.add(12);
        lista.add(9);
        lista.add(7);
        lista.add(6);
        lista.add(2);
        lista.add(3);
        lista.add(7);
        lista.add(16);
        
        int maior = 0;
        int segundoMaior = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            int elementoAtual = lista.get(i);
            
            if (elementoAtual > maior) {
                segundoMaior = maior;
                maior = elementoAtual;
            } else if (elementoAtual > segundoMaior) {
                segundoMaior = elementoAtual;
            }
        }
        
        System.out.println("Seguem os valores abaixo:");
        System.out.println("O maior valor é: " + maior);
        System.out.println("O segundo maior valor é: " + segundoMaior);
    }
}
