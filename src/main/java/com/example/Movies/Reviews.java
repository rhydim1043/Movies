package com.example.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data //Removes the hassle of adding getters and setters or ToString methods
@AllArgsConstructor //Removes the hassle for creation of constructor
@NoArgsConstructor //Constructor that takes no parameter
public class Reviews {
    private ObjectId id;
    private String body;

    public Reviews(String body) {
        this.body = body;
    }
}
