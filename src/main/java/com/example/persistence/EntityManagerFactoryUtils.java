package com.example.persistence;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import jakarta.persistence.EntityManagerFactory;

public final class EntityManagerFactoryUtils
{
  public static EntityManagerFactory createEntityManagerFactory(
    Collection<Class<?>> entityClasses
  )
  {
    final var registry = new StandardServiceRegistryBuilder()
      .build();

    SessionFactory sessionFactory = null;
    try
    {
      sessionFactory = new MetadataSources(registry)
        .addAnnotatedClasses(entityClasses.toArray(new Class<?>[0]))
        .buildMetadata()
        .buildSessionFactory();
    }
    catch(final Exception e)
    {
      // The registry would be destroyed by the SessionFactory, but we
      // had trouble building the SessionFactory so destroy it manually.
      StandardServiceRegistryBuilder.destroy(registry);

      throw e;
    }

    return sessionFactory;
  }

  private EntityManagerFactoryUtils()
  {
    // Does nothing.
  }
}
