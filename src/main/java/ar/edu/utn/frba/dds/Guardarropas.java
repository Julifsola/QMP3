package ar.edu.utn.frba.dds;

import java.util.List;

public class Guardarropas {
  private List<Prenda> prendasSuperiores;
  private List<Prenda> prendasInferiores;
  private List<Prenda> prendasDeCalzado;

  public Guardarropas(){
    this.prendasSuperiores = null;
    this.prendasInferiores = null;
    this.prendasDeCalzado = null;
  }

  public List<Atuendo> GenerarAtuendos() {
    return Sets // Sets no es una clase estándar de Java, ver notas finales
        .cartesianProduct(prendasSuperiores, prendasInferiores, prendasDeCalzado)
        .stream()
        .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2)))
        .collect(toList());
  }
}
