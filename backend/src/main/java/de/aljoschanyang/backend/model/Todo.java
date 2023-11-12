package de.aljoschanyang.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public record Todo(
        @Id
        String id,
        @Field("todo_name")
        String name
) {
}
