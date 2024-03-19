package actividad_3_01;

import java.util.Scanner;

public class trabajador {

		private String nombre;
		private int mes;
		private int año;
		private double salarioBruto;
		private double salarioNeto;

		public trabajador(String nombre, int mes, int año, double salarioBruto, double salarioNeto) {
			this.nombre = nombre;
			this.mes = mes;
			this.año = año;
			this.salarioBruto = salarioBruto;
			this.salarioNeto = salarioNeto;
		}

		public trabajador() {
			this.nombre = "";
			this.mes = 0;
			this.año = 0;
			this.salarioBruto = 0;
			this.salarioNeto = 0;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public double getSalarioBruto() {
			return salarioBruto;
		}

		public void setSalarioBruto(double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}

		public double getSalarioNeto() {
			return salarioNeto;
		}

		public void setSalarioNeto(double salarioNeto) {
			this.salarioNeto = salarioNeto;
		}


	
	//SALARIO BRUTO 
	private static double calculaSalarioBruto(String tipoEmpleado, double ventasMes, double horasExtra) {
		double salario = 0;
		if (tipoEmpleado.equals("vendedor")) {

			salario = 1000;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				salario = salario + 100;
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				} else
					return salario;
			}
			if (ventasMes >= 1500) {
				salario = salario + 200;
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				}
			}
			if (ventasMes < 1000) {
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				} else
					return salario;
			}
		}
		if (tipoEmpleado.equals("encargado")) {
			salario = 1500;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				salario = salario + 100;
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				}
			}
			if (ventasMes >= 1500) {
				salario = salario + 200;
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				}
			}
			if (ventasMes < 1000) {
				if (horasExtra > 0) {
					salario = salario + (horasExtra * 20);
					return salario;
				} else
					return salario;
			}
		}
		return salario;

	}
	
	
	
	
	
	//SALARIO NETO
	private static double calculaSalarioNeto(double salarioBruto) {
		if (salarioBruto >= 1000 && salarioBruto < 1500) {
			salarioBruto = salarioBruto - (salarioBruto * 0.16);
			return salarioBruto;
		}
		if (salarioBruto >= 1500) {
			salarioBruto = salarioBruto - (salarioBruto * 0.18);
			return salarioBruto;
		}
		return salarioBruto;
	}
	
	
	
	
	
	//MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("1) calculaSalarioBruto");
			System.out.println("2) calculaSalarioNeto");
			System.out.println("3) salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dime tipo de empleado");
				String tipoEmpleado = sc.next();
				System.out.println("Dime ventas mes");
				double ventasMes = sc.nextDouble();
				System.out.println("Dime horas extra");
				double horasExtra = sc.nextDouble();
				System.out.println("Salario Bruto " + calculaSalarioBruto(tipoEmpleado, ventasMes, horasExtra));
				break;
			case 2:
				System.out.println("Dime el salario Bruto");
				double salarioBruto = sc.nextDouble();
				System.out.println("Salario Neto " + calculaSalarioNeto(salarioBruto));
			}
		} while (opcion != 3);
		System.out.println("Adios");
	}
	
	
}
