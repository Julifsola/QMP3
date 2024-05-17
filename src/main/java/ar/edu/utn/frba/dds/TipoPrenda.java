package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoPrenda {
  Categoria categoriaPrenda;

  public TipoPrenda(Categoria unaCategoria /*, List<Material> listaMateriales*/) {
    this.categoriaPrenda = unaCategoria;
  }

  public Categoria EsCategoria() {
    return this.categoriaPrenda;
  }

  public Boolean EsMaterialConsistente(Material unMaterial){
    if (this.categoriaPrenda == Categoria.SUPERIOR){
      return materialesSuperior.contains(unMaterial);
    }
    if (this.categoriaPrenda == Categoria.INFERIOR){
      return materialesInferior.contains(unMaterial);
    }
    if (this.categoriaPrenda == Categoria.CALZADO){
      return materialesCalzado.contains(unMaterial);
    }
    if (this.categoriaPrenda == Categoria.ACCESORIO){
      return materialesAccesorio.contains(unMaterial);
    }
    return false;
  }

  static List<Material> materialesSuperior = new ArrayList<>(List.of(Material.ALGODON)); //TODO: Falta popular con materiales reales
  static List<Material> materialesInferior = new ArrayList<>(List.of(Material.ALGODON));
  static List<Material> materialesCalzado= new ArrayList<>(List.of(Material.ALGODON));
  static List<Material> materialesAccesorio = new ArrayList<>(List.of(Material.ALGODON));

  static TipoPrenda REMERA = new TipoPrenda(Categoria.SUPERIOR);
  static TipoPrenda PANTALON = new TipoPrenda(Categoria.INFERIOR);
  static TipoPrenda ZAPATILLA = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda CARTERA = new TipoPrenda(Categoria.ACCESORIO);
}