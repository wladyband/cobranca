package com.iape.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iape.cobranca.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
