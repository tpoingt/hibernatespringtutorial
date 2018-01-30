package ca.effenti.tutorial.hibernate.hibernatespringtutorial;

import ca.effenti.tutorial.hibernate.entity.Author;
import ca.effenti.tutorial.hibernate.entity.Song;
import ca.effenti.tutorial.hibernate.repository.AuthorRepository;
import ca.effenti.tutorial.hibernate.repository.SongRepository;
import org.hibernate.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class HibernateSpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringTutorialApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(SongRepository songRepository, AuthorRepository authorRepository){
	    return (args) -> {
            Author metallica = new Author("Metallica", true);
            Author muse = new Author("Muse", true);
            Author theAnimals = new Author("The Animals", false);
            authorRepository.save(metallica);
            authorRepository.save(theAnimals);
            authorRepository.save(muse);
            songRepository.save(new Song("Nothing else matters", LocalDate.parse("1992-04-20"), metallica));
            songRepository.save(new Song("House of the rising sun", LocalDate.parse("1964-06-01"), theAnimals));
            songRepository.save(new Song("Feeling good", LocalDate.parse("2005-05-12"), muse));
            songRepository.save(new Song("Nea born", LocalDate.parse("2001-08-20"), muse));
        };
    }
}
