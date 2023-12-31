package library.custom;

import lombok.Data;

@Data
public class Genre {
    private long id;

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