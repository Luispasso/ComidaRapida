public class datos{
    private String TipoComida;
    private String Tamaño;
    private String descripcion;
    private double precio;
    private String servicio;

    public datos(String tipoComida, String tamaño, String descripcion, double precio, String servicio) {
        TipoComida = tipoComida;
        Tamaño = tamaño;
        this.descripcion = descripcion;
        this.precio = precio;
        this.servicio = servicio;
    }

    public datos() {
    }
    
    public String getTipoComida() {
        return TipoComida;
    }
    public void setTipoComida(String tipoComida) {
        TipoComida = tipoComida;
    }
    public String getTamaño() {
        return Tamaño;
    }
    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
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
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    
}