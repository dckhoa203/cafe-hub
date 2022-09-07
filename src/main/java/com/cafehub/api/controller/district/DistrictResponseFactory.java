package com.cafehub.api.controller.district;

import com.cafehub.api.domain.district.District;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DistrictResponseFactory {
    @Autowired
    ModelMapper mapper;

    public List<DistrictResponse> toDistrictResponses(final List<District> districts) {
        return !districts.isEmpty() ? districts.stream().map(district -> mapper.map(district, DistrictResponse.class))
                .collect(Collectors.toList()) : Collections.emptyList();
    }

    public DistrictResponse districtResponse(final District district) {
        return mapper.map(district, DistrictResponse.class);
    }
}
