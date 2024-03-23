package com.example.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class FooBasePk implements Serializable
{
  private static final long serialVersionUID = 2662927511921176518L;

  public FooBasePk()
  {
    siteCd = null;
  }

  public FooBasePk(Integer siteCd)
  {
    this.siteCd = siteCd;
  }

  public Integer getSiteCd()
  {
    return siteCd;
  }

  @Column(name = "site_cd")
  private final Integer siteCd;
}
