package io.katharsis.vertx.examples.domain;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.JsonApiToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonApiResource(type = "tasks")
public class Task {

    @JsonApiId
    private Long id;

    private String name;

    @JsonApiToOne
    private Project project;

}
