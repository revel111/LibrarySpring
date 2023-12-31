package library.custom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Writer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date createdAt = new Date();

    @NotBlank
    @Size(min = 3, message = "You must write at least three letters")
    private String writerFName;

    @NotBlank
    @Size(min = 3, message = "You must write at least three letters")
    private String writerSName;

    //@Pattern(regexp = "(^0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}$)", message = "Must be formatted DD-MM-YYYY")
    //private Date dateBirth;
    private String dateBirth;

    @NotBlank
    @Size(min = 3, message = "You must write at least one letter")
    private String placeBirth;
}