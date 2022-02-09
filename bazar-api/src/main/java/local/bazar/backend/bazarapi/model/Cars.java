package local.bazar.backend.bazarapi.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Cars implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String registrationPlate;
    private int makeId;
    private int modelId;
    private int type;
    private String chassis;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date dateIssue;
    private String body;
    private String color;
    private float engineCapacity;
    private float unloadedWeight;
    private String registrationCert;
    private int trailer;
    private int halfTrailer;
    private int mmc;
    private int fuelType;
    private int fuelCardNum;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date insuraceDate;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date technicalOverview;

    @Column(columnDefinition = "TEXT")
    private String additionalNote;




}
