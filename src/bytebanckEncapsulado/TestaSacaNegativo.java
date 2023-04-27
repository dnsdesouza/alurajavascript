package bytebanckEncapsulado;

public class TestaSacaNegativo {

	public static void main(String[] args) {

		Conta conta = new Conta(0, 0);
		conta.deposita(100);
		System.out.println(conta.saca(101));
		System.out.println(conta.saldo);
		
		//conta.saldo = conta.saldo - 101;
		
		//conta.saca(101);
		
		
		System.out.println(conta.getSaldo());
		
		
		
	}

}
