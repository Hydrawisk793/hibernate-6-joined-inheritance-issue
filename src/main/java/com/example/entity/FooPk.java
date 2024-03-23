package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FooPk extends FooBasePk
{
  private static final long serialVersionUID = -370843668302626497L;

  public FooPk()
  {
    super();

    lessonCd = null;
    recordCd = null;
  }

  public FooPk(
    Integer siteCd,
    String lessonCd,
    String recordCd
  )
  {
    super(siteCd);

    this.lessonCd = lessonCd;
    this.recordCd = recordCd;
  }

  public String getLessonCd()
  {
    return lessonCd;
  }

  public String getRecordCd()
  {
    return recordCd;
  }

  @Column(name = "lesson_cd")
  private final String lessonCd;

  @Column(name = "record_cd")
  private final String recordCd;
}
