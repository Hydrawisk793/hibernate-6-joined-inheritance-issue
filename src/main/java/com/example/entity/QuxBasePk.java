package com.example.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class QuxBasePk implements Serializable
{
  private static final long serialVersionUID = 2662927511921176518L;

  public QuxBasePk()
  {
    columnA = null;
  }

  public QuxBasePk(Integer columnA)
  {
    this.columnA = columnA;
  }

  public Integer getColumnA()
  {
    return columnA;
  }

  @Column(name = "column_a")
  private final Integer columnA;
}
