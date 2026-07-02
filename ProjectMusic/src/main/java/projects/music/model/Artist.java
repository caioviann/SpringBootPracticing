package projects.music.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List musics;

    private TypeArtist typeArtist;

    public Artist() {
    }

    public Artist(String name, TypeArtist typeArtist, List musics) {
        this.name = name;
        this.typeArtist = typeArtist;
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getMusics() {
        return musics;
    }

    public void setMusics(List musics) {
        this.musics = musics;
    }
}
