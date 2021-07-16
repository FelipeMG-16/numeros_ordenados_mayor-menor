import java.util.Scanner;
public class NumerosOrdenadosPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int num1,num2,num3;
		 
		int a, b, c;
		
		
		System.out.println("Bienvenido al programa para calcular el número mayor. Disfrútalo. \n ");
		
		Scanner type = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del numero 1: ");
		num1 = type.nextInt();
		
		System.out.println("Ingrese el valor del numero 2: ");
		num2 = type.nextInt();
		
		System.out.println("Ingrese el valor del numero 3: ");
		num3 = type.nextInt();
		

		a = num1;
		b = num2;
		c = num3;
		
		// Comparamos el valor de la variable "a"
		 
				
		if (num1 > num2 && num1 > num3)
					a = num1;
				
		if (num1 < num2 && num1 > num3)
					b = num1;
				
		if (num1 < num2 && num1 < num3)
					c = num1;
				
		 
		// Comparamos el valor de la variable "b"
		 
		if (num2 > num1 && num2 > num3)
					a = num2;
		if (num2 < num1 && num2 > num3)
					b = num2;
		if (num2 < num1 && num2 < num3)
					c = num2;

		
		// Comparamos el valor de la variable "c"
		 
		if (num3 > num2 && num3 > num1)
					a = num3;
		if (num3 < num2 && num3 > num1)
					b = num3;
		if (num3 < num2 && num3 < num1)
					c = num3;
		
		System.out.println("El orden de mayor a menor es el siguiente: " + " " + a + " " + b + " " + c );
		System.out.println();
		
		System.out.println("El orden de menor a mayor es el siguiente: " + " " + c + " " + b + " " + a );
		
	}
}