package es.kokoro.model;

import es.kokoro.model.interfaces.iIngreso;

import java.util.Date;

public class Ingreso {
    private Long idIngreso;
    private Object fuente;
    private double importe;
    private Date fecha;
    private boolean publico;

    /***
     *
     * @param idIngreso Índice de ingreso
     * @param fuente Objeto de tipo varios
     * @param importe Cantidad del ingreso
     * @param fecha Fecha del ingreso
     * @param publico Es un ingreso de una fuente pública [true|false]
     */
    public Ingreso(Long idIngreso, Object fuente, double importe, Date fecha, boolean publico) {
        this.idIngreso = idIngreso;
        this.setFuente(fuente);
        this.importe = importe;
        this.fecha = fecha;
        this.publico = publico;
    }

    /***
     *
     * @return idIngreso
     */
    public Long getIdIngreso() {
        return idIngreso;
    }

    /***
     *
     * @param idIngreso
     */
    public void setIdIngreso(Long idIngreso) {
        this.idIngreso = idIngreso;
    }

    /***
     *
     * @return fuente
     */
    public Object getFuente() {
        return fuente;
    }

    /***
     *
     * @param fuente
     */
    public void setFuente(Object fuente) {
        // Revisar si mejor usar try/catch (o si se puede....)
        if(fuente instanceof iIngreso)
        {
            this.fuente = fuente;
        }
        else{
            System.out.println("Fuente de ingresos no válida");
        }


    }

    /***
     *
     * @return importe
     */
    public double getImporte() {
        return importe;
    }

    /***
     *
     * @param importe
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /***
     *
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /***
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /***
     *
     * @return publico
     */
    public boolean isPublico() {
        return publico;
    }

    /***
     *
     * @param publico
     */
    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "Ingreso{" +
                "fuente=" + fuente.toString() +
                ", importe=" + importe +
                ", fecha=" + fecha +
                ", publico=" + publico +
                '}';
    }
}