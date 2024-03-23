package com.example.entity;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BarBasePk implements Serializable
{
  private static final long serialVersionUID = 2662927511921176518L;

  protected BarBasePk()
  {
    // Does nothing.
  }

  public abstract Integer getSiteCd();
}
