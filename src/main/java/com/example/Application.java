package com.example;

import java.util.List;

import com.example.entity.BarBaseEntity;
import com.example.entity.BarPk;
import com.example.entity.BarSubEntity;
import com.example.entity.FooBaseEntity;
import com.example.entity.FooPk;
import com.example.entity.FooSubEntity;
import com.example.entity.QuxBaseEntity;
import com.example.entity.QuxPk;
import com.example.entity.QuxSubEntity;
import com.example.persistence.EntityManagerFactoryUtils;

public class Application
{
  public static void main(String[] args)
  {
    final var emf = EntityManagerFactoryUtils.createEntityManagerFactory(List.of(
      FooBaseEntity.class,
      FooSubEntity.class,
      BarBaseEntity.class,
      BarSubEntity.class,
      QuxBaseEntity.class,
      QuxSubEntity.class));

    try(final var em = emf.createEntityManager())
    {
      // The order of join columns is wrong since Hibernate 6.2.
      // I can confirm this issue in Hibernate 6.3, Hibernate 6.4
      // and Hibernate 6.5.0.CR1 as well.
      // In Hibernate 6.1, the order is correct.
      //
      // on f1_0.lesson_cd=f1_1.record_cd
      // and f1_0.record_cd=f1_1.site_cd
      // and f1_0.site_cd=f1_1.lesson_cd
      em.find(FooSubEntity.class, new FooPk(1, "LESSON_01", "RECORD_01"));
      em.find(BarSubEntity.class, new BarPk(1, "LESSON_01", "RECORD_01"));

      // The order of join columns are always correct.
      //
      // on qse1_0.column_a=qse1_1.column_a
      // and qse1_0.column_b=qse1_1.column_b
      // and qse1_0.column_c=qse1_1.column_c
      em.find(QuxSubEntity.class, new QuxPk(1, "LESSON_01", "RECORD_01"));
    }
  }
}
