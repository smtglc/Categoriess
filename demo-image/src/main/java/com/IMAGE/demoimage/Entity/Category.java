package com.IMAGE.demoimage.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "category")
@Data
public class Category {



    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String uuid;

    private String categoryName;
    private String thumbnail;
    private String categoryItemImage;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(name = "title",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "title_id"))
    private List<Title> titles = new ArrayList<>();
}