package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "t_qux_sub")
@Entity
public class QuxSubEntity extends QuxBaseEntity
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
