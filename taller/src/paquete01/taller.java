package paquete01;
import java.util.Scanner;
import paquete02.Enfermero;
import paquete02.Hospital;
import paquete02.Medico;
import paquete01.SueldoTotal;

public class taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        boolean bandera2 = true;
        String cadena = "";
        System.out.println("Ingrese el hospital");
        String nombrehospital = entrada.nextLine();
        System.out.println("Ingrese la direccion");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese el numero de especialidades que va a tomar");
        int numeroespecialidades = entrada.nextInt();
        entrada.nextLine();
        Hospital hospital = new Hospital(nombrehospital, direccion, ciudad, provincia, numeroespecialidades);
        cadena = String.format("%s\n%s", cadena, hospital);
        System.out.println("Ingreso de Medicos");
        while (bandera) {
            System.out.println("Ingrese el nombre del medico");
            String medico = entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            String especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual del medico");
            double sueldomedicos = entrada.nextDouble();
            entrada.nextLine();
            Medico m1 = new Medico(medico, especialidad, sueldomedicos);

            System.out.println("Ingrese n para"
                    + " dejar de ingresar datos");
            String opcion = entrada.nextLine();
            cadena = String.format("%s\n%s", cadena, m1);
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
        System.out.println("Ingreso de Enfermeros");
        while (bandera2) {
            System.out.println("Ingrese el nombre del enfermero");
            String enfermera = entrada.nextLine();
            System.out.println("Tipo de contrato");
            String tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual");
            double sueldoenfermeros = entrada.nextDouble();
            entrada.nextLine();
            Enfermero e1 = new Enfermero(enfermera, tipo, sueldoenfermeros);
            System.out.println("Desea ingresar más enfermeros/as. Ingrese n para"
                    + " salir del ciclo repetitivo");
            String opcion = entrada.nextLine();
            cadena = String.format("%s\n%s", cadena, e1);
            if (opcion.equals("n")) {
                bandera2 = false;
            }
        }

        System.out.println(cadena);

    }

}
