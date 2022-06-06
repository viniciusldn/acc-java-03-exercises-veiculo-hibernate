package com.trybe.acc.java.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Veiculo.
 */
@Entity
public class Veiculo {

  /** The id. */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /** The ano. */
  @Column
  private int ano;

  /** The modelo. */
  @Column
  private String modelo;

  /** The quilometragem. */
  @Column
  private String quilometragem;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets the ano.
   *
   * @return the ano
   */
  public int getAno() {
    return this.ano;
  }

  /**
   * Sets the ano.
   *
   * @param ano the new ano
   */
  public void setAno(int ano) {
    this.ano = ano;
  }

  /**
   * Gets the modelo.
   *
   * @return the modelo
   */
  public String getModelo() {
    return this.modelo;
  }

  /**
   * Sets the modelo.
   *
   * @param modelo the new modelo
   */
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   * Gets the quilometragem.
   *
   * @return the quilometragem
   */
  public String getQuilometragem() {
    return this.quilometragem;
  }

  /**
   * Sets the quilometragem.
   *
   * @param quilometragem the new quilometragem
   */
  public void setQuilometragem(String quilometragem) {
    this.quilometragem = quilometragem;
  }
}
