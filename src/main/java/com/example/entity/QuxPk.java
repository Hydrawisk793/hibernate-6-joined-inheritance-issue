package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class QuxPk extends QuxBasePk
{
  private static final long serialVersionUID = -370843668302626497L;

  public QuxPk()
  {
    columnB = null;
    columnC = null;
  }

  public QuxPk(
    Integer columnA,
    String columnB,
    String columnC
  )
  {
    super(columnA);

    this.columnB = columnB;
    this.columnC = columnC;
  }

  public String getColumnB()
  {
    return columnB;
  }

  public String getColumnC()
  {
    return columnC;
  }

  @Column(name = "column_b")
  private final String columnB;

  @Column(name = "column_c")
  private final String columnC;
}
