package com.project.dataservice.repository;

import com.project.dataservice.model.HistoryGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryGamesRepository extends JpaRepository<HistoryGames, Long> {
}
