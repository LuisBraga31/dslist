package com.luisbraga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisbraga.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}