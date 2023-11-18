package com.akzvitor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akzvitor.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
