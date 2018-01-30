package ca.effenti.tutorial.hibernate.repository;

import ca.effenti.tutorial.hibernate.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{


    List<Song> findByTitle(String title);

}
