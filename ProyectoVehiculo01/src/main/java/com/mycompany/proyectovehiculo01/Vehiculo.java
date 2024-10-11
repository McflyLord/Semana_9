public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        validarDatos();  // Validar datos al crear el vehículo
    }

    // Método abstracto para validar datos
    public abstract void validarDatos();

    public abstract void mostrarInfo();

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
}
