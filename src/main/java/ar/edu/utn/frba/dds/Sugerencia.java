package ar.edu.utn.frba.dds;

public class Sugerencia {
  private Prenda prendaSuperiores;
  private Prenda prendaInferiores;
  private Prenda prendaDeCalzado;

  public Sugerencia(Prenda unaPrendaSuperior, Prenda unaPrendaInferior, Prenda unaPrendaCalzado){
    this.prendaSuperiores = unaPrendaSuperior;
    this.prendaInferiores = unaPrendaInferior;
    this.prendaDeCalzado = unaPrendaCalzado;
  }

  public Sugerencia fabricar(Sastre sastre) {
    return new Sugerencia(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
  }
}
