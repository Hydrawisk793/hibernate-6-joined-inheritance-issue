package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BarPk extends BarBasePk
{
  private static final long serialVersionUID = -370843668302626497L;

  public BarPk()
  {
    siteCd = null;
    lessonCd = null;
    recordCd = null;
  }

  public BarPk(
    Integer siteCd,
    String lessonCd,
    String recordCd
  )
  {
    this.siteCd = siteCd;
    this.lessonCd = lessonCd;
    this.recordCd = recordCd;
  }

  @Override
  public Integer getSiteCd()
  {
    return siteCd;
  }

  public String getLessonCd()
  {
    return lessonCd;
  }

  public String getRecordCd()
  {
    return recordCd;
  }

  @Column(name = "site_cd")
  private final Integer siteCd;

  @Column(name = "lesson_cd")
  private final String lessonCd;

  @Column(name = "record_cd")
  private final String recordCd;
}
