package paquete01;
import paquete02.Enfermero;
import paquete02.Medico;

public class SueldoTotal {

    private double sueldoMedico;
    private double sueldoEnfermera;

    public SueldoTotal(Medico m, Enfermero e) {
        sueldoMedico = m.obtenerSueldo();
        sueldoEnfermera = e.obtenerSueldo();
    }

    public double obtenerSueldosTotales() {
        return sueldoMedico + sueldoEnfermera;
    }

    public String toString() {
        String cadena = String.format("Total de sueldos a pagar por mes: %.2f", obtenerSueldosTotales());
        return cadena;
    }
}
