package ca.effenti.tutorial.hibernate.repository;

import ca.effenti.tutorial.hibernate.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{

    
}
