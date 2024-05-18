package ar.edu.utn.frba.dds;

import java.awt.*;

public class Prenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;
  private Trama trama;
  private Formalidad formalidad;

  /**/
  public Prenda(Categoria categoria, TipoPrenda tipo, Material material, ColorPrenda colorPrimario, ColorPrenda colorSecundario, Trama trama, Formalidad unaFormalidad) {
    this.tipo = tipo;
    this.categoria = tipo.EsCategoria();
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
    this.colorSecundario = colorSecundario; // Puede ser NULL
    this.formalidad = unaFormalidad;
  }

  public boolean esInformal(){
    return formalidad == Formalidad.INFORMAL;
  }

  public boolean esSuperior(){
    return categoria == Categoria.SUPERIOR;
  }

  public boolean esInferior(){
    return categoria == Categoria.INFERIOR;
  }

  public boolean esCalzado(){
    return categoria == Categoria.CALZADO;
  }
}

