package gestionTarjetas.Gestion_Tarjetas.exection;

public class ResourceNotFoundException extends RuntimeException {
    private String message;
    public ResourceNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
