package ar.edu.utn.frba.dds;

public class ContructorPrenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;
  private Trama trama;

  public void setTipo(TipoPrenda tipo) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("El tipo no debe estar vacio");
    }
    this.tipo = tipo;
    this.categoria = tipo.EsCategoria();
  }

  public void setMaterial(Material material) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("Primero se debe configurar el TIPO");
    }
    if (colorPrimario == null || trama == null) {
      throw new ExcepcionPrendaInvalida("El material no debe estar vacio");
    }
    this.material = material; // TODO: Validar material
  }

  public void setTrama(Trama trama) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("Primero se debe configurar el TIPO");
    }
    if (colorPrimario == null) {
      throw new ExcepcionPrendaInvalida("La trama no debe estar vacia");
    }
    this.trama = trama;
  }

  public void setColorPrimario(ColorPrenda colorPrimario) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("Primero se debe configurar el TIPO");
    }
    if (colorPrimario == null) {
      throw new ExcepcionPrendaInvalida("El color primario no debe estar vacio");
    }
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(ColorPrenda colorSecundario) {
    if (tipo == null) {
      throw new ExcepcionPrendaInvalida("Primero se debe configurar el TIPO");
    }
    this.colorSecundario = colorSecundario;
  }

  /*
  private void valirPrenda() {
  }*/

  public Prenda cargarPrenda() {
    //valirPrenda();
    return new Prenda(this.categoria, this.tipo, this.material, this.colorPrimario, this.colorSecundario, this.trama);
  }
}
