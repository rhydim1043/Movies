package com.example.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //Removes the hassle of adding getters and setters or ToString methods
@AllArgsConstructor //Removes the hassle for creation of constructor
@NoArgsConstructor //Constructor that takes no parameter
public class Movies {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference //to indicate that the "reviewIds" attribute is a reference to a different collection (in this case, a collection of reviews)
    private List<Reviews> reviewIds;
}
