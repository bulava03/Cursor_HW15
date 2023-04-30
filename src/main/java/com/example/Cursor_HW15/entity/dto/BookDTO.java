package com.example.Cursor_HW15.entity.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {

    @NotNull
    private String title;
    @NotNull
    private String author;
    @NotNull
    private String genre;
    @Min(1)
    private int pages;

}
