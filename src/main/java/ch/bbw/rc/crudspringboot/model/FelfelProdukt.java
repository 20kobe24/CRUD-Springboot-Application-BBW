package ch.bbw.rc.crudspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FelfelProdukt")
public class FelfelProdukt {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "price")
    private Float price;

    @Column(nullable = false, name = "name")
    private String name;

    @ManyToMany(mappedBy = "felfelProdukts")
    private List<User> users = new ArrayList<>();


}
