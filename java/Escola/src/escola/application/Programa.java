package escola.application;

import escola.entities.Pos;
import escola.services.EstudanteService;
import escola.utils.UI;

public class Programa {

	public static void main(String[] args) {
		UI.imprimeDadosEscola();
		Pos pos = (Pos) EstudanteService.obterDadosEstudante("Pos");
		pos.movimento();
	}
}
