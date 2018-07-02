package com.ssbaez.ejercicio807;

public class PruebaTiempo {
	
	public static void main(String[] args) {
		
		Tiempo t1 = new Tiempo(); // 00:00:00
		Tiempo t2 = new Tiempo(2); // 02:00:00
		Tiempo t3 = new Tiempo(21, 34); // 21:34:00
		Tiempo t4 = new Tiempo(23, 59, 59); // 12:25:42
		Tiempo t5 = new Tiempo(t4); // 12:25:42
		
		System.out.println("Se construyo con: ");
		mostrarTiempo("t1: todos los argumentos predeterminados", t1);
		mostrarTiempo("t2: se especifico hora; minuto y segundo predeterminados", t2);
		mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
		mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
		mostrarTiempo("t5: se especifico el objeto Tiempo llamado t4", t5);
		
		//Intento de inicializar t6 con valores invalidos
		try {
			Tiempo t6 = new Tiempo(27, 74, 99); //Valores invalidos
		}
		catch(IllegalArgumentException e) {
			System.out.printf("%nExcepcion al inicializar t6: %s%n",
					e.getMessage());
		}
		t1.ticTac();
		mostrarTiempo("t1: se aumenta un segundo", t1);
		t2.ticTac();
		mostrarTiempo("t2: se aumenta un segundo", t2);
		t3.ticTac();
		mostrarTiempo("t3: se aumenta un segundo", t3);
		t4.ticTac();
		mostrarTiempo("t4: se aumenta un segundo", t4);
		
		
	}
	
	private static void mostrarTiempo(String encabezado, Tiempo tt) {
		
		System.out.printf("%s%n %s%n %s%n",
				encabezado, tt.aStringUniversal(), tt.toString());
		
	}

}
