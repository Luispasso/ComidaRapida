public class datos{
    private String TipoComida;
    private String Tamaño;
    private int cantidad;
    private double precio;
    private int id;
    private String Estado;
    public datos(String tipoComida, String tamaño, int cantidad, double precio, int id, String estado) {
        TipoComida = tipoComida;
        Tamaño = tamaño;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id;
        Estado = estado;
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
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    
    
}