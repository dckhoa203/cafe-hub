package com.cafehub.api.controller.province;

import com.cafehub.api.validation.Number;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceGetByIdRequest {
    private static final String ID_INVALID_MESSAGE = "Province id must be numeric and greater than 0";

    @Number(message = ID_INVALID_MESSAGE)
    private String id;
}
