package com.akzvitor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akzvitor.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
