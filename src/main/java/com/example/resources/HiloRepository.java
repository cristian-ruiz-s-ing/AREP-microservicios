package com.example.resources;

import javax.enterprise.context.ApplicationScoped;

import com.example.model.Hilo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class HiloRepository implements PanacheRepository<Hilo> {
}
