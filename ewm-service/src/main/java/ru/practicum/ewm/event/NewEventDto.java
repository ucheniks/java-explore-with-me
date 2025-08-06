package ru.practicum.ewm.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class NewEventDto {

    @NotBlank(message = "Аннотация не может быть пустой")
    @Size(max = 2000, message = "Аннотация может содержать не более 2000 символов")
    private String annotation;

    @NotNull(message = "Категория обязательна")
    @Positive(message = "ID категории должен быть положительным числом")
    private Long category;

    @NotBlank(message = "Описание не может быть пустым")
    @Size(max = 7000, message = "Описание может содержать не более 7000 символов")
    private String description;

    @NotNull(message = "Дата события обязательна")
    @Future(message = "Дата события должна быть в будущем")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventDate;

    @NotNull(message = "Локация обязательна")
    private Location location;

    @Builder.Default
    private Boolean paid = false;

    @Builder.Default
    @PositiveOrZero(message = "Лимит участников не может быть отрицательным")
    private Long participantLimit = 0L;

    @Builder.Default
    private Boolean requestModeration = true;

    @NotBlank(message = "Заголовок не может быть пустым")
    @Size(max = 120, message = "Описание может содержать не более 120 символов")
    private String title;
}
