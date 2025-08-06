package ru.practicum.ewm.compilation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class NewCompilationDto {
    @NotBlank
    @Size(max = 50)
    private String title;

    @Builder.Default
    private Boolean pinned = false;

    private Set<Long> events;
}