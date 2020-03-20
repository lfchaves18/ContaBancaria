import java.util.Scanner;

public class Sistema {

	public Banco banco = new Banco();

	public Conta abrirConta() {

		Scanner ler = new Scanner(System.in);

		System.out.println("\n---Criar conta---.\n");
		System.out.println("Insira seu CPF: ");
		String cpf = ler.next();
		System.out.println("Insira seu nome: ");
		String nome = ler.next();

		int numeroConta = banco.listContas.size();
		numeroConta++;

		Conta conta = new Conta(numeroConta, nome, cpf);

		banco.listContas.add(conta);
		return conta;
	}

	public void mostrarContas() {

		for (Conta cont : banco.listContas) {
			System.out.println("\n\nDados para confirmação: ");
			System.out.println("Nome: " + cont.titular.nome);
			System.out.println("CPF: " + cont.titular.cpf);
			System.out.println("Número da conta: " + cont.numero);

		}
	}
}