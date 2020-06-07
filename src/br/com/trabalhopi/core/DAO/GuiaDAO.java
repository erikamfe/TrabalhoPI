package br.com.trabalhopi.core.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.trabalhopi.core.GuiaTurismo;

public class GuiaDAO {

	private List<GuiaTurismo> guias = new ArrayList<>();
	
	public void addGuia(GuiaTurismo guia) {
		guias.add(guia);
	}
}
