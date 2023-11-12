package de.aljoschanyang.backend.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
public record Todo(
        @Id
        String id,
        @Field("todo_name")
        String name
) {
}
