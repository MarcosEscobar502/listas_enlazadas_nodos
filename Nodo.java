
public class Nodo 
{
	int nc;
	String nombre;
	String carrera;
	int edad;
	Nodo sig;
	
	public Nodo(int n, String nom, String c, int ed)
	{
		nc = n;
		nombre = nom;
		carrera = c;
		edad = ed;
		sig = null;
	}

}
