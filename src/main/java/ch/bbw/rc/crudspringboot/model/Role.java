package ch.bbw.rc.crudspringboot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = true)
    private String name;


}


