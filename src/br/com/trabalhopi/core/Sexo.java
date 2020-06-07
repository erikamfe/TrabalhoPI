package br.com.trabalhopi.core;

import java.util.Arrays;
import java.util.Optional;

public enum Sexo {
	
	MASCULINO('M'),	FEMININO('F');
	public char sexo;
	
	Sexo(char sexo) {
		this.sexo = sexo;	
	}	 
	
	 public static Optional<Sexo> valueOf(char value) {
	        return Arrays.stream(values())
	            .filter(legNo -> legNo.sexo == value)
	            .findFirst();
	    }
}
