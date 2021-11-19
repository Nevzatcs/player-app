package com.graphql.playerapp.repository;

import com.graphql.playerapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Query("SELECT " +
            "  CASE " +
            "   WHEN " +
            "       COUNT(p)>0 " +
            "   THEN " +
            "       TRUE " +
            "   ELSE " +
            "       FALSE " +
            "   END " +
            "FROM Player p " +
            "WHERE p.id = ?1")
    boolean existsById(Long id);
}
