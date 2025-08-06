package ru.practicum.ewm.compilation;

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
public class UpdateCompilationDto {
    @Size(min = 1, max = 50)
    private String title;

    private Boolean pinned;

    private Set<Long> events;
}