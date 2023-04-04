package dto_classes;


import jakarta.validation.constraints.NotNull;

public record DataClass(@NotNull int id,@NotNull String url,@NotNull String description,@NotNull int[] tgChatIds) {

}
