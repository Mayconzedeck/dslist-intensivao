package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//<Tipo da entidade, tipo da chave primária>
public interface GameRepository extends JpaRepository<Game, Long> {

}
