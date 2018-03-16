package supermercado;

import java.io.IOException;
import java.util.*;

public class Supermercado {
	public static void main(String[] args) {
		
		ArrayList<Empleado> list = new ArrayList<Empleado>();
		list.add(new Empleado("Miguel", "Tesoreria", "Supervisor", 200));
		list.add(new Empleado("William", "Compras", "Jefe de Departamento", 300));
		list.add(new Empleado("Afton", "Gerencia", "Gerente", 900));
		list.add(new Empleado("Michel", "Administracion", "Asesor", 600));
		
		System.out.println("Bienvenidos al Sistema de Empleados de Supermercado SantaFe");
		int opcion = 0;
		String seleccion;
		
		do {
			System.out.println("[1]. Imprimir Detalles Empleados");
			System.out.println("[2]. Imprimir Empleados");
			System.out.println("[3]. Asignar Nombre");
			System.out.println("[4]. Asignar Posicion");
			System.out.println("[5]. Asignar Salario");
			System.out.println("[6]. Salir");
			
			System.out.print("Seleccione una opcion : ");
			opcion = LeerConsola.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Imprimiendo lista de empleados...");
					Empleado.Imprimir(list);
					System.out.println("Presione cualquier tecla para continuar");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Imprimiendo Empleados...");
					Empleado.Empleados(list);
					System.out.println("Presione cualquier tecla para continuar");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.print("Seleccione una posicion : ");
					seleccion = LeerConsola.nextString();
					Empleado.asgnNombre(list, seleccion);
					System.out.println("Presione cualquier tecla para continuar");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.print("Seleccione un nombre : ");
					seleccion = LeerConsola.nextString();
					Empleado.asgnPosicion(list, seleccion);
					System.out.println("Presione cualquier tecla para continuar");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.print("Seleccione un nombre : ");
					seleccion = LeerConsola.nextString();
					Empleado.asgnSalario(list, seleccion);
					System.out.println("Presione cualquier tecla para continuar");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 6:
					System.out.println("Saliendo del Sistema de Empleados");
					System.out.println("----------------");
					break;
				default:
					System.out.println("Selecciono una opcion invalida");
					break;
			}
			
		}while(opcion!=6);
		
	}
}