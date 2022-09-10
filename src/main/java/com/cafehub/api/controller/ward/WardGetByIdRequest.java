package com.cafehub.api.controller.ward;

import com.cafehub.api.validation.Number;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WardGetByIdRequest {
    private static final String WARD_ID_INVALID_MESSAGE = "Ward id must be numeric and greater than 0";

    @Number(message = WARD_ID_INVALID_MESSAGE)
    private String id;
}
