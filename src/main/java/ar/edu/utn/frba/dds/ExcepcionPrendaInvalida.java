package ar.edu.utn.frba.dds;

public class ExcepcionPrendaInvalida extends RuntimeException {
  public ExcepcionPrendaInvalida(String mensaje) {
    super("Error en la creacion de PRENDA: " + mensaje);
  }
}