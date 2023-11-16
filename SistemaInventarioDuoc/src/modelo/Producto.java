package modelo;


public abstract class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private int precioProducto;
    private int cantidadProducto;
    private String categoriaProducto;

    public Producto(int idProducto, String nombreProducto, int precioProducto, int cantidadProducto, String categoriaProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidadProducto=" + cantidadProducto + ", categoriaProducto=" + categoriaProducto + '}';
    }
    
}
