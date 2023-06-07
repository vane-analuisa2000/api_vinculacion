package com.casaculturatungurahua.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String address;
    private String bibliography;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Artwork> artworks;
}