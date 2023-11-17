package library.custom.utils;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private GenreType type;

    private enum GenreType {
        DRAMA,
        HISTORY,
        STUDY,
        HORROR,
        SCIENCE_FICTION,
        FANTASY
    }
}