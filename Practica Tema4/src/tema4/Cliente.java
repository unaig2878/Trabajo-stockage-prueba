package tema4;

import java.util.Date;
import java.util.Scanner;

public class Cliente {
	private String nombre;
	private String apellidos;
	private Date fechaDeAlta;
	private int telefono;
	private String direccion;
	private String historial;
	// declaramos los atributos


	public Cliente() {

		this.fechaDeAlta = new Date();
	}

//creamos el constructor
	public Cliente(String nombre, String apellidos, int telefono, String direccion, String historial,
			Date fechaDeAlta) {
		this.nombre = nombre.toLowerCase();
		this.apellidos = apellidos.toUpperCase();

			this.telefono = telefono;
			// restricciones para la direccion
		if (direccion != null && !direccion.isEmpty()) {
			this.direccion = direccion;
		} else {
			System.out.println("No puede estar vacio");

		}
		this.historial = historial;
		this.fechaDeAlta = new Date();
	}

	// restricciones del telefono
	public void revisartel(int telefono) {
		while (!(telefono > 555555555 && telefono < 1000000000)) {

			this.telefono = telefono;
		}
		if (telefono < 555555555 || telefono > 1000000000) {
			System.out.println("Formato del numero invalido");

		}
	}

	// metodo para agregar el codigo de pago al historial del pedido
	public void agregarPedido(GestionPedidos codigoPago1) {
		this.historial += codigoPago1 + "\n";
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	// metodos para que realizar el pedido
	public void realizarPedido(int telefonocliente, int precproducto1, int precproducto2, int precproducto3,
			int precproducto4, int precproducto5, String nomproducto1, String nomproducto2, String nomproducto3,
			String nomproducto4, String nomproducto5, int telefono1, int telefono2, int telefono3, int resp2, int cant1,
			int cant2, int precfin1, int precfin2, int precfinfin, Producto producto1, Producto producto2,
			Producto producto3, Producto producto4, Producto producto5, PasarelaDePago pago, int precp1, int precp2) {
		// le restringimos el acceso a usuarios que no tengan cuenta
		if (telefonocliente == telefono1 || telefonocliente == telefono2 || telefonocliente == telefono3) {
			Scanner sc = new Scanner(System.in);
			// imprimimos todos los pedidos posibles y le damos la opcion de elgir
			System.out.println("Estas Registrado");
			System.out.println("Seleccione el producto que quiere en numero");
			System.out.println("1." + nomproducto1);
			System.out.println("2." + nomproducto2);
			System.out.println("3." + nomproducto3);
			System.out.println("4." + nomproducto4);
			System.out.println("5." + nomproducto5);
			int resp1 = sc.nextInt();
			// le damos la opcion de elegir otro
			System.out.println("¿Quiere otro?(recuerde que solo le queda 1)");
			System.out.println("1.si ... 2.No");
			int decision = sc.nextInt();
			if (decision == 1) {
				System.out.println("1." + nomproducto1);
				System.out.println("2." + nomproducto2);
				System.out.println("3." + nomproducto3);
				System.out.println("4." + nomproducto4);
				System.out.println("5." + nomproducto5);
				System.out.println("Escriba el numero de cual");
				resp2 = sc.nextInt();
				if (resp1 != resp2) {
					switch (resp1) {
					// le imprimimos los productos que haya pedido y pedimos cantidad+calculo de
					// precio
					case 1:
						System.out.println("Tu primer producto:" + nomproducto1);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto1.setCantidad(cant1);
						precp1 = precproducto1;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el primer producto es:" + precfin1);

						break;
					case 2:
						System.out.println("Tu primer producto:" + nomproducto2);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto2.setCantidad(cant1);
						precp1 = precproducto2;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el primer producto es:" + precfin1);
						break;
					case 3:
						System.out.println("Tu primer producto:" + nomproducto3);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto3.setCantidad(cant1);
						precp1 = precproducto3;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el primer producto es:" + precfin1);
						break;
					case 4:
						System.out.println("Tu primer producto:" + nomproducto4);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto4.setCantidad(cant1);
						precp1 = precproducto4;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el primer producto es:" + precfin1);
						break;
					case 5:
						System.out.println("Tu primer producto:" + nomproducto5);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto5.setCantidad(cant1);
						precp1 = precproducto5;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el primer producto es:" + precfin1);
						break;
					default:
						System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 5.");
					}
					switch (resp2) {
					// imprimimos segundo producto pedimos cantidad e imprimimos precio
					case 1:
						System.out.println("Tu segundo producto es un Movil.");
						System.out.println("Indique la cantidad que quiere");
						cant2 = sc.nextInt();
						producto1.setCantidad(cant2);
						precp2 = precproducto1;
						precfin2 = precp2 * cant2;
						System.out.println("el precio a pagar por el segundo producto es:" + precfin2);

						break;
					case 2:
						System.out.println("Tu segundo producto es un  Ratón.");
						System.out.println("Indique la cantidad que quiere");
						cant2 = sc.nextInt();
						producto2.setCantidad(cant2);
						precp2 = precproducto2;
						precfin2 = precp2 * cant2;
						System.out.println("el precio a pagar por el segundo producto es:" + precfin2);
						break;
					case 3:
						System.out.println("Tu segundo producto es un Portátil.");
						System.out.println("Indique la cantidad que quiere");
						cant2 = sc.nextInt();
						producto3.setCantidad(cant2);
						precp2 = precproducto3;
						precfin2 = precp2 * cant2;
						System.out.println("el precio a pagar por el segundo producto es:" + precfin2);
						break;
					case 4:
						System.out.println("Tu segundo producto es un  Monitor.");
						System.out.println("Indique la cantidad que quiere");
						cant2 = sc.nextInt();
						producto4.setCantidad(cant2);
						precp2 = precproducto4;
						precfin2 = precp2 * cant2;
						System.out.println("el precio a pagar por el segundo producto es:" + precfin2);
						break;
					case 5:
						System.out.println("Tu segundo producto es un  Ordenador.");
						System.out.println("Indique la cantidad que quiere");
						cant2 = sc.nextInt();
						producto5.setCantidad(cant2);
						precp2 = precproducto5;
						precfin2 = precp2 * cant2;
						System.out.println("el precio a pagar por el segundo producto es:" + precfin2);
						break;
					default:
						System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 5.");
					}
				} else {
					System.out.println("No puede ser el mismo producto que el primero");
				}
			} else {
				if (decision == 2) {
					switch (resp1) {
					// Opcion de 1 solo pedido
					case 1:
						System.out.println("Tu producto:" + nomproducto1);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto1.setCantidad(cant1);
						precp1 = precproducto1;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el  producto es:" + precfin1);
						break;
					case 2:
						System.out.println("Tu producto:" + nomproducto2);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto2.setCantidad(cant1);
						precp1 = precproducto2;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el  producto es:" + precfin1);
						break;
					case 3:
						System.out.println("Tu  producto:" + nomproducto3);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto3.setCantidad(cant1);
						precp1 = precproducto3;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el  producto es:" + precfin1);
						break;
					case 4:
						System.out.println("Tu  producto:" + nomproducto4);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto4.setCantidad(cant1);
						precp1 = precproducto4;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el  producto es:" + precfin1);
						break;
					case 5:
						System.out.println("Tu  producto:" + nomproducto5);
						System.out.println("Indique la cantidad que quiere");
						cant1 = sc.nextInt();
						producto5.setCantidad(cant1);

						precp1 = precproducto5;
						precfin1 = precp1 * cant1;
						System.out.println("el precio a pagar por el  producto es:" + precfin1);
						break;
					default:
						System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 5.");
					}
				} else {
					System.out.println("Valor no valido");
				}
				sc.close();
			}


		} else {
			// imprimimos error por si no esta registrado
			System.out.println("Su numero de telefono no esta registrado");
			System.out.println("Registrese por favor");
		}

	}
}
