package ch.bbw.rc.crudspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FelfelProdukt")
public class FelfelProdukt {
    @Id
    @Column(name = "id", unique = true)
    private Long id;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
    private String name;


}
