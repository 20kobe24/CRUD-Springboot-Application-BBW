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
@Table(name = "ginger_shot")
public class GingerShot {
    @Id
    @Column(name = "id", unique = true)
    private Long id;

    @Column(nullable = false)
    private Integer price;
}
