package projects.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.music.model.Artist;

import java.util.List;

public interface ArtistRepository extends JpaRepository {

    List<Artist> listArtist

}
