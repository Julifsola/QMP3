package ar.edu.utn.frba.dds.Uniforme;

import ar.edu.utn.frba.dds.Prenda;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda unaPrendaSuperior, Prenda unaPrendaInferior, Prenda unCalzado){
    this.prendaSuperior = unaPrendaSuperior;
    this.prendaInferior = unaPrendaInferior;
    this.calzado = unCalzado;
  }

  public Uniforme fabricar(Sastre sastre) {
    return new Uniforme(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
  }
}