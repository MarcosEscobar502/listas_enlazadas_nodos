import java.util.Scanner;


public class Principal 
{

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		lista_ordenada lista = new lista_ordenada();
		int opc;
		
		int nc;
		String nom;
		String ca;
		int edad;
		do{
			System.out.println("[1] - Insertar");
			System.out.println("[2] - Retirar");
			System.out.println("[3] - Mostrar");
			System.out.println("[4] - Alumno de Mayor Edad");
			System.out.println("[5] - Salir");
			opc = leer.nextInt();
			System.out.println();
			switch(opc)
			{
			case 1:
				System.out.println("No. de Control: ");
				nc = leer.nextInt();
				System.out.println("Nombre: ");
				nom = leer.next();
				System.out.println("Carrera: ");
				ca = leer.next();
				System.out.println("Edad: ");
				edad = leer.nextInt();
				lista.insertar(nc, nom, ca, edad);
				System.out.println();
				break;
			case 2:
				System.out.println("No. Control Que Desea Retirar?");
				nc = leer.nextInt();
				lista.retirar(nc);
				System.out.println();
				break;
			case 3:
				lista.mostrar();
				System.out.println();
				break;
			case 4:
				MayorEdad(lista);
				System.out.println();
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion No Valida!");
			}
		}while(opc != 5);
	}
	
	public static void MayorEdad(lista_ordenada lista)
	{
		Nodo mayor = lista.apt;
		Nodo n = lista.apt;
		while(n != null)
		{
			if(n.edad > mayor.edad)
				mayor = n;
			n = n.sig;
		}
		System.out.println("El Alumno Con Mayor Edad Es: " + mayor.nombre + " Con " + mayor.edad + " Años");
	}

}
