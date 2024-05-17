package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Prenda> prendas = new ArrayList<Prenda>();
  private Integer edad;
  private MotorSugerencias motorSugerencias;

  public Integer getEdad() {
    return edad;
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }

  public Usuario(Integer edad, MotorSugerencias motor){
  	this.edad = edad;
    this.motorSugerencias = motor;
  }

  public List<Guardarropas> generarSugerencias(){
    return this.motorSugerencias.generarSugerencias(this);
  }
}
