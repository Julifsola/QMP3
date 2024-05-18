package ar.edu.utn.frba.dds;

import java.util.List;


public class MotorSugerenciasFormalidad implements  MotorSugerencias{

  public List<Prenda> getPrendasValidas(Usuario usuario){
    //return usuario.getEdad() > 55 ? usuario.getPrendas().filter(p -> !p.isInformal()) : usuario.getPrendas();
    return usuario.getEdad() > 55 ? usuario.getPrendas().stream().filter(prenda -> !prenda.esInformal()).toList() : usuario.getPrendas();
  }

  public List<Sugerencia> generarSugerencias(Usuario usuario){
    List<Prenda> prendasSuperiores = this.getPrendasValidas(usuario).stream().filter(Prenda::esSuperior).toList();
    List<Prenda> prendasInferiores = this.getPrendasValidas(usuario).stream().filter(Prenda::esInferior).toList();
    List<Prenda> calzados = this.getPrendasValidas(usuario).stream().filter(Prenda::esCalzado).toList();

    //Uso una biblioteca como Guava para el producto cartesiano
    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.map(c -> new Sugerencia(c[0], c[1], c[2]))
  }

}