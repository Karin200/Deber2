
public class Test {

	public static void main(String[] args) {
		Venta v = new Venta();
		
		try {
			v.calcularTotal();
	        } catch (Exception ex) {
	            System.out.println("Error: "+ex.getMessage());
	        }

	}

}
