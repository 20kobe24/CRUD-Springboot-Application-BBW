package ch.bbw.rc.crudspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "vorname")
    private String vorname;

    @Column(nullable = false, name = "nachname")
    private String nachname;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = true, updatable = true)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Buchung> buchungen;

    @ManyToMany
    @JoinTable(name = "felfelprodukt_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "felfelprodukt_id"))
    List<FelfelProdukt> felfelProdukts = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "gingershot_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "gingershot_id"))
    List<GingerShot> gingerShots = new ArrayList<>();


}
