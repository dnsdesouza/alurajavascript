package bytebanckEncapsulado;

public class TestaValores {
	
	 public static void main (String [] args) {
		 
		 Conta conta = new Conta(1337,24226);
		 
		// System.out.println("Estou criando uma conta na Agencia: "+conta.getAgencia());
		 
		 conta.setAgencia(1212121212);
		 
		 Conta conta2 = new Conta(13337, 16549);
		 Conta conta3 = new Conta(2112, 14660);
		 
		 System.out.println("Total de Contas criadas: "+Conta.getTotal());
		 
		 System.out.println("Agencia e conta da conta2 :"+conta2.getAgencia()+"  "+conta2.getNumero());
		 System.out.println("Agencia e conta da conta3 :"+conta3.getAgencia()+"  "+conta3.getNumero());
		 
	 }

}
