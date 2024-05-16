package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;
  private Trama trama;

  /**/
  public Prenda(Categoria categoria, TipoPrenda tipo, Material material, ColorPrenda colorPrimario, ColorPrenda colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.categoria = tipo.EsCategoria();
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
    this.colorSecundario = colorSecundario; // Puede ser NULL
  }

}

