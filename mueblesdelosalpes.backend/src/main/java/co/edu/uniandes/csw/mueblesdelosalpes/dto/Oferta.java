package co.edu.uniandes.csw.mueblesdelosalpes.dto;

public class Oferta {

    private Long muebleId;
    private String descripcion;
    private double precio;

    // Getters y setters

    public Long getMuebleId() {
        return muebleId;
    }

    public void setMuebleId(Long muebleId) {
        this.muebleId = muebleId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
