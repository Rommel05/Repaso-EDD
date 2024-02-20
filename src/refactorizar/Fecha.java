package refactorizar;

/**
 * Clase fecha:
 * Comprueba si una fecha es valida
 * @author Rommel
 * @version 1.0, 20/02/2024
 */
class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     *Constructor de la clase fecha
     * @param dia Variable de tipo entero que corresponde al dia
     * @param mes Variable de tipo entero que corresponde al mes
     * @param anio Variable de tipo entero que corresponde al anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Clase para ver si la fecha es válida
     * @return regresa si la fecha es valido o no
     */
    public boolean valida() {
        if (dia < 1 || dia > 31) return false;
        if (mes < 1 || mes > 12) return false;
        if (anio < 0) return false;

        int diasMes = diaMes();
        if (dia > diasMes)
            return false;
        else
            return true;
    }

    /**
     * Devuelve el dia máximo del mes
     * @return devuelve diasMes que calcula el dia máximo del mes
     */
    private int diaMes() {
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11: diasMes = 30;
                break;
            case 2:
                diasMes = añoBisiesto();
                break;
        }
        return diasMes;
    }

    /**
     * Comprueba si el año es bisiesto
     * @return regresa diasMes 29 si es bisiesto o 28 si no lo es
     */
    private int añoBisiesto() {
        int diasMes;
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio %
                100 != 0)))
            diasMes = 29;
        else
            diasMes = 28;
        return diasMes;
    }
}
