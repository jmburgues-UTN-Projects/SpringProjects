package com.utn.newsAPI.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;
import org.springframework.data.annotation.AccessType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@NoArgsConstructor // lombok
@Data  // lombok
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "typeNews", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Text.class, name = "TEXT"),
        @JsonSubTypes.Type(value = Image.class, name = "IMAGE"),
        @JsonSubTypes.Type(value = Video.class, name = "VIDEO")
})
@Entity // identifies the class as a database entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Type of DB inheritance
public abstract class News {
    @Id // identifies the next attribute as the entity's primary key.
    private Integer id;
    private String title;
    private String description;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract TypeNews typeNews();

}
