package library.custom;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import library.custom.utils.Genre;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @NotBlank
    @Size(min = 3, message = "You must write at least three letters")
    private String name;

    @ManyToOne
    private Genre genre;

    @Size(min = 1, message = "You must choose at least ome author")
    @ManyToMany()
    private List<Writer> authors;

    //@Nullable
    private double price;

    @Size(min = 1, message = "Book must have at least one page")
    private long pages;

    //isbn
}