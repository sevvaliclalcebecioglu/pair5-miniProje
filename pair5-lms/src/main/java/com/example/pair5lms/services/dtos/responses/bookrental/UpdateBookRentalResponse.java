package com.example.pair5lms.services.dtos.responses.bookrental;

import lombok.Data;

@Data
public class UpdateBookRentalResponse {
    private int id;

    private boolean isAllBookReturned;
}