package ch.bbw.rc.crudspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "buchung")
public class Buchung {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "status")
    private Boolean status;

    @Column(nullable = false, name = "ganz_taetig")
    private Boolean ganz_taetig;

    @Column(nullable = false, name = "halb_taetig")
    private Boolean halb_taetig;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
