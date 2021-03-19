package br.com.caelum.ingresso.validation;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.TipoDeIngresso;

public class Testes {

	public static void main(String[] args) {
	
		System.out.println(TipoDeIngresso.BANCO.aplicaDesconto(new BigDecimal("100.00")));
		
		
		TipoDeIngresso[] tipos = TipoDeIngresso.values();
		
		for (TipoDeIngresso tipo : tipos) {
			System.out.println(tipo.getDescricao());
		}

	}

}
