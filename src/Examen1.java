import java.util.Scanner;


public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_scanner= new Scanner (System.in);
		System.out.print("Ingrese num1: ");
		double num1 = mi_scanner.nextFloat();
		System.out.print("Ingrese num2: ");
		double num2 = mi_scanner.nextFloat();
		System.out.println("sumar 1, restar 2, multiplicar 3,dividir 4: ");
    	Scanner mi_scanner1= new Scanner (System.in);
			int num3=mi_scanner1.nextInt();
			if(num3==1)
		{
		 		System.out.println("La suma es: "+(num1+num2));
			}else if (num3==2)
		 			{
		 		System.out.println("La resta es: "+(num1-num2));
		 		}else if (num3==3)
		 				{
					System.out.println("La multiplicacion es: "+(num1*num2));
		 			}else if (num3==4)
		 			 {
		 			 System.out.println("La division es: "+(num1/num2));
		 	}
	}

}
