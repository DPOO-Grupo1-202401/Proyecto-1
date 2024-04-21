import java.io.FileNotFoundException;
import java.io.IOException;

import logica.Galeria;

public class InterfazInicio {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        InterfazInicio consola = new InterfazInicio();
        consola.ejecutarOpcion();

    }

    public void ejecutarOpcion() throws FileNotFoundException, IOException {
        Galeria galeria = new Galeria();
        {
            boolean continuar = true;
            while (continuar) {
                try {
                    galeria.cargarEsculturas();
                    galeria.cargarFotografias();
                    galeria.cargarImpresiones();
                    galeria.cargarPinturas();
                    galeria.cargarVideos();
                    

                    System.out.println(
                            "\n----------------------------------------------------------------------------------------");
                    System.out.println("\nBienvenido al Sistema de la Galeria");
                    System.out.println("\n1. Iniciar sesion como cliente");
                    System.out.println("2. Iniciar sesion como empleado");
                    System.out.println("3. Iniciar sesion como administrador");
                    System.out.println("5. Registrarse como nuevo cliente");
                    System.out.println("6. Salir de la aplicacion");

                    int opcionSeleccionada = Integer.parseInt(input("\nPor favor seleccione una opcion"));

                    if (opcionSeleccionada == 1) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(
                                "----------------------------------------------------------------------------------------");
                        System.out.println("\nLogin: ");
                        String loginCliente = scanner.nextLine();
                        System.out.println("\nContraseña: ");
                        String contraseñaCliente = scanner.nextLine();

                        if (sistema.verificarCliente(loginCliente, contraseñaCliente)) {
                        }    
                        
                    }
                }
            }
        }
    }
}
