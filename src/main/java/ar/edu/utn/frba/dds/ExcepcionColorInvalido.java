package ar.edu.utn.frba.dds;

public class ExcepcionColorInvalido extends RuntimeException {
  public ExcepcionColorInvalido(String mensaja) {
    super("Error en la asignacion de COLOR: " + mensaja);
  }
}