package ar.edu.utn.frba.dds.Uniforme;

import ar.edu.utn.frba.dds.*;

public class SastreSanJuan implements  Sastre{
  public Prenda fabricarParteSuperior(){
    TipoPrenda unTipo = new TipoPrenda(Categoria.SUPERIOR);
    CrearPrenda borrador = new CrearPrenda(unTipo);
    ColorPrenda unColor = new ColorPrenda(255,255,255);
    borrador.setColorPrimario(unColor);
    borrador.setColorSecundario(unColor);
    borrador.setTrama(Trama.CUADROS);
    borrador.setMaterial(Material.ALGODON);
    return borrador.ValidarYCrear();
  }
  public Prenda fabricarParteInferior(){ //TODO: Configurar
    TipoPrenda unTipo = new TipoPrenda(Categoria.SUPERIOR);
    CrearPrenda borrador = new CrearPrenda(unTipo);
    ColorPrenda unColor = new ColorPrenda(255,255,255);
    borrador.setColorPrimario(unColor);
    borrador.setColorSecundario(unColor);
    borrador.setTrama(Trama.CUADROS);
    borrador.setMaterial(Material.ALGODON);
    return borrador.ValidarYCrear();
  }
  public Prenda fabricarCalzado(){ //TODO: Configurar
    TipoPrenda unTipo = new TipoPrenda(Categoria.SUPERIOR);
    CrearPrenda borrador = new CrearPrenda(unTipo);
    ColorPrenda unColor = new ColorPrenda(255,255,255);
    borrador.setColorPrimario(unColor);
    borrador.setColorSecundario(unColor);
    borrador.setTrama(Trama.CUADROS);
    borrador.setMaterial(Material.ALGODON);
    return borrador.ValidarYCrear();
  }
}
