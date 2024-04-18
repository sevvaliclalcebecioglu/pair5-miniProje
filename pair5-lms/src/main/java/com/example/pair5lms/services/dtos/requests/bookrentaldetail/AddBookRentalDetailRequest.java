package com.example.pair5lms.services.dtos.requests.bookrentaldetail;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddBookRentalDetailRequest {
    @NotNull(message = "You must enter a book location id.")
    private int bookLocationId;

    @NotNull(message = "You must enter a book rental id.")
    private int bookRentalId;

    @Positive(message = "Book Price must be higher than 0.")
    private double bookPrice;

    private LocalDateTime rentalStartDate;

    @FutureOrPresent
    private LocalDateTime rentalEndDate;

    private LocalDateTime rentalReturnDate;

    @NotNull(message = "Allowed input: 'true' or 'false'")
    private boolean isReturned;
}
