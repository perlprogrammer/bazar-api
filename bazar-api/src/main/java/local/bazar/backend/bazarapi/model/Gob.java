package local.bazar.backend.bazarapi.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gob implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private int uid;

    @DateTimeFormat(pattern="dd-MM-yyyy HH:MM:ss")
    private Date gob_date;
    private int status;
    private Date date;
    private Time time;


}
