package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoPrenda {
  Categoria categoriaPrenda;
  List<Material> materiales;

  public TipoPrenda(Categoria unaCategoria, List<Material> listaMateriales) {
    this.categoriaPrenda = unaCategoria;
    this.materiales = Collections.unmodifiableList(listaMateriales);
  }

  public Categoria EsCategoria() {
    return this.categoriaPrenda;
  }

  public Boolean EsMaterialConsistente(Material unMaterial){
    return this.materiales.contains(unMaterial);
  }

  static List<Material> materialesSuperior = new ArrayList<>(List.of(Material.ALGODON)); //TODO: Falta popular con materiales reales
  static List<Material> materialesPantalon = new ArrayList<>(List.of(Material.ALGODON));
  static List<Material> materialesZapatilla= new ArrayList<>(List.of(Material.ALGODON));
  static List<Material> materialesCartera = new ArrayList<>(List.of(Material.ALGODON));

  static TipoPrenda REMERA = new TipoPrenda(Categoria.SUPERIOR, materialesSuperior);
  static TipoPrenda PANTALON = new TipoPrenda(Categoria.INFERIOR, materialesPantalon);
  static TipoPrenda ZAPATILLA = new TipoPrenda(Categoria.CALZADO, materialesZapatilla);
  static TipoPrenda CARTERA = new TipoPrenda(Categoria.ACCESORIO, materialesCartera);
}