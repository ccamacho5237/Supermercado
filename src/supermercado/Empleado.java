package supermercado;

import java.util.ArrayList;

public class Empleado{
	
	private String Nombre;
	private String Departamento;
	private String Posicion;
	private Integer Salario;
	
	public Empleado(String nombre, String departamento, String posicion, Integer salario) {
		this.Nombre = nombre;
		this.Departamento = departamento;
		this.Posicion = posicion;
		this.Salario = salario;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public String getDepartamento() {
		return Departamento;
	}
	
	public String getPosicion() {
		return Posicion;
	}
	
	public int getSalario() {
		return Salario;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public void setDepartamento(String Departamento) {
		this.Departamento = Departamento;
	}
	
	public void setPosicion(String Posicion) {
		this.Posicion = Posicion;
	}
	
	public void setSalario(Integer Salario) {
		this.Salario = Salario;
	}
	
	@Override
	public String toString() {
		
		return "[ Nombre=" + Nombre + ", Departamento=" + Departamento + ", Posicion= "+ Posicion +", Salario = "+ Salario +"]" + "\n";
		
	}
	
	public static void Imprimir(ArrayList<Empleado> emp) {
		for(Empleado a:emp) {
			System.out.print(a);
		}
	}
	public static void Empleados(ArrayList<Empleado> emp) {
		for(Empleado str : emp) {
			System.out.println(str.getNombre());
		}
	}
	public static void asgnNombre(ArrayList<Empleado> emp , String posicion) {
		String nombre;
		int i=0;
		for(Empleado asgn : emp) {
			if(asgn.getPosicion().equals(posicion)) {
				System.out.print("Nombre al cual va a cambiar : ");
				nombre = LeerConsola.nextString();
				asgn.setNombre(nombre);
				System.out.println("El Nombre fue cambiado de manera satisfactoria.");
				i++;
			}
		}
		if(i==0) {
			System.out.println("No se encontro la posicion " + posicion + " en la lista de Empleados.");
		}
	}
	
	public static void asgnPosicion(ArrayList<Empleado> emp , String nombre) {
		String Posicion;
		int i=0;
		for(Empleado asgn : emp) {
			if(asgn.getNombre().equals(nombre)) {
				System.out.print("Posicion al cual va a cambiar : ");
				Posicion = LeerConsola.nextString();
				asgn.setPosicion(Posicion);
				System.out.println("La posicion fue cambiado de manera satisfactoria.");
				i++;
			}
		}
		if(i==0) {
			System.out.println("No se encontro el nombre de " + nombre + " en la lista de Empleados.");
		}
	}
	
	public static void asgnSalario(ArrayList<Empleado> emp , String nombre) {
		int salario = 0;
		int i=0;
		for(Empleado asgn : emp) {
			if(asgn.getNombre().equals(nombre)) {
				System.out.print("Salario al cual va a cambiar : ");
				salario = LeerConsola.nextInt();
				asgn.setSalario(salario);
				System.out.println("El salario fue cambiado de manera satisfactoria.");
				i++;
			}
		}
		if(i==0) {
			System.out.println("No se encontro el nombre de " + nombre + " en la lista de Empleados.");
		}
	}
}