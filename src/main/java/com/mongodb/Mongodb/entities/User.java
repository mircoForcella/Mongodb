package com.mongodb.Mongodb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "users")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
