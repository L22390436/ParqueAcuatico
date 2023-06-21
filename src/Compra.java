import javax.swing.*;

public class Compra {
    private double precioEntrada, precioBufet, precioEspectaculo, precioNadoDelfines;
    private double precioTotal;
    private String tipoBufet, lugarEspectaculo, tipoInteraccion;

    public void CalcularTotal(double precioEntrada){
        this.precioTotal = this.precioEntrada;
    }

    public void CalcularTotal(double precioEntrada, String tipoBufet, double precioBufet){
        this.precioEntrada = this.getPrecioEntrada();
        this.tipoBufet = this.getTipoBufet();
        this.precioBufet = this.getPrecioBufet();

        this.precioTotal = this.precioEntrada + this.precioBufet;
    }

    public void CalcularTotal(double precioEntrada, String tipoBufet, double precioBufet, String lugarEspectaculo, double precioEspectaculo){
        this.precioEntrada = this.getPrecioEntrada();
        this.tipoBufet = this.getTipoBufet();
        this.precioBufet = this.getPrecioBufet();
        this.lugarEspectaculo = this.getLugarEspectaculo();
        this.precioEspectaculo = this.getPrecioEspectaculo();

        this.precioTotal = this.precioEntrada + this.precioBufet + this.precioEspectaculo;
    }

    public void CalcularTotal(double precioEntrada, String tipoBufet, double precioBufet, String lugarEspectaculo,
                              double precioEspectaculo, String tipoInteraccion, double precioNadoDelfines){
        this.precioEntrada = this.getPrecioEntrada();
        this.tipoBufet = this.getTipoBufet();
        this.precioBufet = this.getPrecioBufet();
        this.lugarEspectaculo = this.getLugarEspectaculo();
        this.precioEspectaculo = this.getPrecioEspectaculo();
        this.tipoInteraccion = this.getTipoInteraccion();
        this.precioNadoDelfines = this.getPrecioNadoDelfines();

        this.precioTotal = this.precioEntrada + this.precioBufet + this.precioEspectaculo + this.precioNadoDelfines;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setPrecioBufet(double precioBufet) {
        this.precioBufet = precioBufet;
    }

    public void setPrecioEspectaculo(double precioEspectaculo) {
        this.precioEspectaculo = precioEspectaculo;
    }

    public void setPrecioNadoDelfines(double precioNadoDelfines) {
        this.precioNadoDelfines = precioNadoDelfines;
    }

    public void setTipoBufet(String tipoBufet) {
        this.tipoBufet = tipoBufet;
    }

    public void setLugarEspectaculo(String lugarEspectaculo) {
        this.lugarEspectaculo = lugarEspectaculo;
    }

    public void setTipoInteraccion(String tipoInteraccion) {
        this.tipoInteraccion = tipoInteraccion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public double getPrecioBufet() {
        return precioBufet;
    }

    public double getPrecioEspectaculo() {
        return precioEspectaculo;
    }

    public double getPrecioNadoDelfines() {
        return precioNadoDelfines;
    }

    public String getTipoBufet() {
        return tipoBufet;
    }

    public String getLugarEspectaculo() {
        return lugarEspectaculo;
    }

    public String getTipoInteraccion() {
        return tipoInteraccion;
    }

}
