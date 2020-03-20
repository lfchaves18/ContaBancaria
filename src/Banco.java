import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	public List<Conta> listContas = new ArrayList<>();

	public Banco(List<Conta> listCont) {
		listContas = listCont;
	}

	public Banco() {
	}

	public boolean validarAgencia(int numAgencia) {

		if (numAgencia == 1 || numAgencia == 2 || numAgencia == 3 || numAgencia == 4 || numAgencia == 5)
			return true;
		return false;
	}

}