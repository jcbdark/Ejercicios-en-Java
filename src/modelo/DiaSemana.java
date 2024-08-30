package modelo;

public enum DiaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esDiaLaboral(){
        return !(this == SABADO || this == DOMINGO);
    }
}
