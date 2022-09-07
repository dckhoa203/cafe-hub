package com.cafehub.api.controller.district;

import com.cafehub.api.validation.Number;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistrictGetByIdRequest {
    private static final String DISTRICT_ID_INVALID_MESSAGE = "District id must be numeric and greater than 0";

    @Number(message = DISTRICT_ID_INVALID_MESSAGE)
    private String id;
}
