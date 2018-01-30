package ca.effenti.tutorial.hibernate.repository;

import ca.effenti.tutorial.hibernate.entity.Song;
import ca.effenti.tutorial.hibernate.hibernatespringtutorial.HibernateSpringTutorialApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateSpringTutorialApplication.class)
public class SongRepositoryTest {
    @Autowired
    private SongRepository songRepository;

    @Test
    public void whenFindAll_returnsAllSongs() {
        List<Song> all = songRepository.findAll();
        all.forEach(System.out::println);

    }

}