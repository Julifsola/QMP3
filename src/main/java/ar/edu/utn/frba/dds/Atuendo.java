package ar.edu.utn.frba.dds;

import java.util.List;

public class Atuendo {
  private Prenda prendaSuperiores;
  private Prenda prendaInferiores;
  private Prenda prendaDeCalzado;

  public Atuendo(Prenda unaPrendaSuperior, Prenda unaPrendaInferior, Prenda unaPrendaCalzado){
    this.prendaSuperiores = unaPrendaSuperior;
    this.prendaInferiores = unaPrendaInferior;
    this.prendaDeCalzado = unaPrendaCalzado;
  }
}
