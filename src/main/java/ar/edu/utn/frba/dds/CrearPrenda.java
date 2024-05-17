package ar.edu.utn.frba.dds;

public class CrearPrenda {
  private TipoPrenda tipo;
  private Categoria categoria;
  private Material material;
  private ColorPrenda colorPrimario;
  private ColorPrenda colorSecundario;
  private Trama trama = Trama.LISA;

  public CrearPrenda(TipoPrenda unTipo){
    this.tipo = unTipo;
    this.categoria = null;
    this.material = null;
    this.colorSecundario = null;
    this.colorPrimario = null;
    this.trama = null;
  }

  public Prenda ValidarYCrear(){
    return new Prenda(categoria, tipo, material, colorPrimario, colorSecundario, trama);
  }

  public void setTipoPrenda(TipoPrenda unTipo){
    if (unTipo == null) {
      throw new ExcepcionPrendaInvalida("El tipo no debe estar vacio");
    }
    this.tipo = unTipo;
    this.categoria = tipo.EsCategoria();
  }

  public void setMaterial(Material unMaterial){
    checkearTipoPenda();
    checkearAspectosParaElMaterial();
    if (unMaterial == null) {
      throw new ExcepcionPrendaInvalida("El material no debe estar vacio");
    }
    if (!this.tipo.EsMaterialConsistente(unMaterial)){
      throw new ExcepcionPrendaInvalida("El material no consiste con el tipo de prenda");
    }
    this.material = unMaterial;
  }

  public void setColorPrimario(ColorPrenda unColorPrimario) {
    checkearTipoPenda();
    if (unColorPrimario == null) {
      throw new ExcepcionPrendaInvalida("El color primario no debe estar vacio");
    }
    this.colorPrimario = unColorPrimario;
  }

  public void setColorSecundario(ColorPrenda unColorSecundario){
    checkearTipoPenda();
    this.colorSecundario = unColorSecundario;
  }

  public void setTrama(Trama unaTrama){
    checkearTipoPenda();
    if (unaTrama == null) {
      throw new ExcepcionPrendaInvalida("La trama no debe estar vacia");
    }
    this.trama = unaTrama;
  }


  private void checkearTipoPenda(){
    if (this.tipo == null) {
      throw new ExcepcionPrendaInvalida("Primero se debe setear el Tipo de la prenda");
    }
  }
  private void checkearAspectosParaElMaterial(){
    if (this.colorPrimario == null) {
      throw new ExcepcionPrendaInvalida("Se debe setear el Color Primario previo al Material");
    }
    if (this.trama == null) {
      throw new ExcepcionPrendaInvalida("Se debe setear la Trama previo al Material");
    }
  }

}

