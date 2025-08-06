package ru.practicum.ewm.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class NewUserDto {
    @NotBlank(message = "Имя обязательно и не может быть пустым")
    private String name;

    @NotBlank(message = "Email обязателен и не может быть пустым")
    @Email(message = "Некорректный формат email")
    private String email;
}
