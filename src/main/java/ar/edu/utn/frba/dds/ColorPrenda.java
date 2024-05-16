package ar.edu.utn.frba.dds;

public class ColorPrenda {
  int rojo, verde, azul;

  public ColorPrenda(int colorRojo, int colorVerde, int colorAzul) {
    if (colorRojo < 0 || colorRojo > 255) {
      throw new ExcepcionColorInvalido("El valor del color ROJO debe estar comprendido entre 0 y 255");
    }
    this.rojo = colorRojo;

    if (colorVerde < 0 || colorVerde > 255) {
      throw new ExcepcionColorInvalido("El valor del color VERDE debe estar comprendido entre 0 y 255");
    }
    this.verde = colorVerde;

    if (colorAzul < 0 || colorAzul > 255) {
      throw new ExcepcionColorInvalido("El valor del color AZUL debe estar comprendido entre 0 y 255");
    }
    this.azul = colorAzul;
  }
}