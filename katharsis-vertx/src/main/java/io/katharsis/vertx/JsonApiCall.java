package io.katharsis.vertx;

public enum JsonApiCall {
    COLLECTION_GET,
    RESOURCE_GET,
    RELATIONSHIP_GET,
    FIELD_GET,

    RESOURCE_POST,
    FIELD_POST,
    RELATIONSHIP_POST,

    RESOURCE_PATCH,
    RELATIONSHIP_PATCH,

    RESOURCE_DELETE,
    RELATIONSHIP_DELETE
}
