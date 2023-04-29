package ClasseCliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c01 = new Cliente();
		Cliente c02 = new Cliente();
		
		c01.lerInformacoes("Ana Maria", "12345678900", "Rua XYZ", "19999999999", "email@maria.com");
		c02.lerInformacoes("Carlos José", "98765432100", "Rua ABC", "19999991111", "email@carlos.com");
		
		c01.mostrarInformacoes();
		c02.mostrarInformacoes();
	}

}
