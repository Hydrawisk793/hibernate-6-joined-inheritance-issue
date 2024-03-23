package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "t_bar_sub")
@Entity
public class BarSubEntity extends BarBaseEntity
{
  public String getPlayUrl()
  {
    return playUrl;
  }

  public String getDownloadUrl()
  {
    return downloadUrl;
  }

  private String playUrl;

  private String downloadUrl;
}
