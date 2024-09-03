package view;

import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();

		System.out.println("Pilha Vazia = " +p.isEmpty());
		p.push(0);
		p.push(80);
		p.push(30);
		p.push(50);
		System.out.println("dados na pilha"+p.size());
		System.out.println("Pilha Vazia = " +p.isEmpty());
		try {
			
			while(!p.isEmpty()) {
			int valor=p.pop();
			System.out.println(" Pop = "+ valor);
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Pilha Vazia = " +p.isEmpty());
		System.out.println("dados na pilha"+p.size());
	}

}
