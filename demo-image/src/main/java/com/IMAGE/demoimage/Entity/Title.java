package com.IMAGE.demoimage.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorytitle")
@Data
public class Title {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String uuid;
    private String title;
    private String description;
    private String videoUrl;
    private String textUrl;
    private String date;
    private String thumbnail;
    private String discoverItemImage;


}

