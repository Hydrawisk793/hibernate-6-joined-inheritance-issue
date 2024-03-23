package com.example.entity;

import java.time.Instant;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "t_qux_base")
@Entity
public class QuxBaseEntity
{
  public QuxPk getPrimaryKey()
  {
    return primaryKey;
  }

  public Instant getCreatedAt()
  {
    return createdAt;
  }

  public Instant getModifiedAt()
  {
    return modifiedAt;
  }

  public Instant getRemovedAt()
  {
    return removedAt;
  }

  @EmbeddedId
  private QuxPk primaryKey;

  private Instant createdAt;

  private Instant modifiedAt;

  private Instant removedAt;
}
