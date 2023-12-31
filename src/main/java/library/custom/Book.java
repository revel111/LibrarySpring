package library.custom;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Book {
    private Long id;

    private Date createdAt = new Date();

    @NotBlank
    @Size(min = 3, message = "You must write at least three letters")
    private String name;

    private Genre genre;

    @Size(min = 1, message = "You must choose at least ome author")
    private List<Writer> authors;

    //@Nullable
    private double price;

    @Size(min = 1, message = "Book must have at least one page")
    private long pages;

    //isbn
}