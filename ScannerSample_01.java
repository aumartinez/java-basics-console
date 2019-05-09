import java.util.Scanner;

public class ScannerSample_01 {
	
	private static double price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es el precio del producto?");
		
		price = sc.nextDouble();
		price += 25.00;
		
		System.out.print("El precio con cargos de envios es: ");
		System.out.print(price);
		System.out.println(", gracias por su compra.");

	}

}
