package com.luisbraga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisbraga.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
