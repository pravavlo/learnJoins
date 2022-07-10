package com.example.learnjoins.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long tutId;
    @Column(name="title", length = 1000)
    private String title;
    @Column(name="description", length = 1500)
    private String description;
    @Column(name="published", length = 1500)
    private String published;
    @JsonIgnoreProperties("tutorial")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "tutorial_fk", referencedColumnName = "tutId")
    private List<Comment> comments;
}
