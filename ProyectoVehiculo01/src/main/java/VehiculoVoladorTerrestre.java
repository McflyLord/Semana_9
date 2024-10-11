public class VehiculoVoladorTerrestre extends VehiculoTerrestre {
    private int envergadura;

    public VehiculoVoladorTerrestre(String marca, String modelo, int año, int ruedas, int envergadura) {
        super(marca, modelo, año, ruedas);
        this.envergadura = envergadura;
        validarDatos();
    }

    @Override
    public void validarDatos() {
        super.validarDatos();  // Validar ruedas
        if (envergadura <= 0) {
            throw new IllegalArgumentException("La envergadura debe ser mayor que cero.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehículo Volador Terrestre: " + getMarca() + " " + getModelo() + " (" + getAño() + ") - Ruedas: " + getRuedas() + " - Envergadura: " + envergadura);
    }
}

