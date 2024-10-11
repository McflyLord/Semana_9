public interface Motorizado {
    void encender();
    
    default void detener() {
        System.out.println("El vehículo ha sido detenido.");
    }
}
