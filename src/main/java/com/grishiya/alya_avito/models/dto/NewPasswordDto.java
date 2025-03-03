package com.grishiya.alya_avito.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class NewPasswordDto {

    @NotBlank(message = "New password не может быть пустым")
    @Size(min = 8, max = 16, message = "Длина пароля должна быть от 8 до 16 символов")
    private String newPassword;

    @NotBlank(message = "Current password не может быть пустым")
    @Size(min = 8, max = 16, message = "Длина подтверждающего пороля должна быть" +
            "от 8 до 16 символво")
    private String currentPassword;

    public NewPasswordDto() {

    }

    public NewPasswordDto(String newPassword, String currentPassword) {
        this.newPassword = newPassword;
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
       if (this.getClass() != o.getClass() || o == null)
            return false;
       NewPasswordDto passwordDto = (NewPasswordDto) o;
        return passwordDto.newPassword.equals(this.newPassword) && passwordDto.currentPassword.equals(this.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, currentPassword);
    }
}
