package com.example.debtsapi.interfaces;

import com.example.debtsapi.entities.Deuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DeudaRepository extends JpaRepository<Deuda,Integer> {
}
