package library.custom;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class Writer {
    private Long id;

    private Date createdAt = new Date();

    @NotBlank
    @Size(min = 3, message = "You must write at least one letter")
    private String writerFName;

    @NotBlank
    @Size(min = 3, message = "You must write at least one letter")
    private String writerSName;

    @Pattern(regexp = "(^0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}$)", message = "Must be formatted DD-MM-YYYY")
    private String dateBirth;

    @NotBlank
    @Size(min = 3, message = "You must write at least one letter")
    private String placeBirth;
}