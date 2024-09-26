package dto_classes.response;

import java.time.OffsetDateTime;

public record GHResponse(String name, OffsetDateTime updatedAt) {
}
