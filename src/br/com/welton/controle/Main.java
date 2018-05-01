package br.com.welton.controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.welton.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
	
			List<Pessoa> lista = new ArrayList<Pessoa>();
			
			//primeira pessoa 
			Pessoa p1 = new Pessoa();
			p1.setCodigo(1);
			p1.setNome("Fabio");
			p1.setSobrenome("António");
			p1.setNascimento(sdf.parse("12/12/1989"));
			lista.add(p1);
			
			//segunda pessoa 
			Pessoa p2 = new Pessoa();
			p2.setCodigo(2);
			p2.setNome("António");
			p2.setSobrenome("Silva");
			p2.setNascimento(sdf.parse("01/01/1990"));
			lista.add(p2);
			
			//terceira pessoa 
			Pessoa p3 = new Pessoa();
			p3.setCodigo(3);
			p3.setNome("Flávio");
			p3.setSobrenome("Monteiro");
			p3.setNascimento(sdf.parse("10/05/1970"));
			lista.add(p3);
		
			//quarta pessoa 
			Pessoa p5 = new Pessoa();
			p5.setCodigo(5);
			p5.setNome("Denilson");
			p5.setSobrenome("Montero");
			p5.setNascimento(sdf.parse("10/10/1973"));
			lista.add(p5);
		
			
			//quinta pessoa 
			Pessoa p4 = new Pessoa();
			p4.setCodigo(4);
			p4.setNome("Denilson");
			p4.setSobrenome("Monteiro");
			p4.setNascimento(sdf.parse("10/10/1973"));
			lista.add(p4);

			//Primeira opção ordenação direto na classe
//			Collections.sort(lista, new Pessoa());

			Collections.sort(lista, ordenaPessoaNascimento());
		
			Collections.reverse(lista);
			
			for(Pessoa p: lista) {
				System.out.println("Nome: " + p.getNome());
				System.out.println("Sobrenome: " + p.getSobrenome());
				System.out.println("Nascimento: " + p.getNascimento());
				
			}
			
			
			
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Método que retorna o comparator para ordenação de pessoa por nome e sobrenome.
	 * @return
	 */
	public static Comparator<Pessoa> ordenaPessoaNomeSobrenome(){
		
		return new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				int resultado = p1.getNome().compareTo(p2.getNome());
				if(resultado == 0)
					resultado = p1.getSobrenome().compareTo(p2.getSobrenome());
				return resultado;
			}
		};
		
		
	}
	
	
	/**
	 * Método que retorna o comparator para ordenação de pessoa por nascimento.
	 * @return
	 */
	public static Comparator<Pessoa> ordenaPessoaNascimento(){
		
		return new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				int resultado = p1.getNascimento().compareTo(p2.getNascimento());
				return resultado;
			}
		};
		
		
	}
	
}
