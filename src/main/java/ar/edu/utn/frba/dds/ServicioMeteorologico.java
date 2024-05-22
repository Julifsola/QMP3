package ar.edu.utn.frba.dds;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
}