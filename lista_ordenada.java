
public class lista_ordenada 
{
	Nodo apt;
	Nodo fin;
	
	public lista_ordenada()
	{
		apt = null;
		fin = null;
	}
	
	
	public void vacia()
	{
		apt = null;
		fin = null;
	}
	
	public void insertar(int nc, String nom, String ca, int ed)
	{
		Nodo n = new Nodo(nc, nom, ca,ed);
		if(apt == null)
		{
			apt = n;
		}else{
			fin.sig = n;
		}
		fin = n;
	}
	
	public void retirar(int nc)
	{
		if(apt == null) 
			return;
		if(apt.nc == nc)
		{
			if(apt == fin)
			{
				vacia();
			}else{
				apt = apt.sig;
			}
			return;
		}
			
		Nodo n = apt;
		while(n.sig != null){
			if(n.sig.nc == nc && n.sig != fin)
			{
				n.sig = n.sig.sig;
				return;
			}else if(n.sig.nc == nc){
				n.sig = null;
				fin = n;
				return;
			}
			n = n.sig;
		}
	}
	
	public void mostrar()
	{
		Nodo n = apt;
		while(n != null)
		{
			System.out.println("NControl: " + n.nc + ", Nombre: " + n.nombre + ", Edad: " + n.edad + ", Carrera: " + n.carrera);
			n = n.sig;
		}
	}
	
}
