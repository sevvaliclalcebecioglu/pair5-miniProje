package com.example.pair5lms.services.dtos.responses.bookrentaldetail;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddBookRentalDetailResponse {
    private int id;

    private LocalDateTime rentalStartDate;

    private LocalDateTime rentalEndDate;

    private LocalDateTime rentalReturnDate;

    private boolean isReturned;
}
