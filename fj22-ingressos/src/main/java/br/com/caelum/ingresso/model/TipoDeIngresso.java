package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;
import br.com.caelum.ingresso.model.descontos.DescontoParaBancos;
import br.com.caelum.ingresso.model.descontos.DescontoParaEstudantes;
import br.com.caelum.ingresso.model.descontos.SemDesconto;

public enum TipoDeIngresso {
	
	ESTUDANTE(new DescontoParaEstudantes()),
	INTEIRO(new SemDesconto()),
	BANCO(new DescontoParaBancos());
	
	private Desconto desconto;
	
	TipoDeIngresso(Desconto desconto) {
		this.desconto = desconto;
	}

	public BigDecimal aplicaDesconto(BigDecimal precoOriginal) {
		return this.desconto.aplicarDescontoSobre(precoOriginal);
	}

	public String getDescricao() {
		return this.desconto.getDescricao();
	}

}
