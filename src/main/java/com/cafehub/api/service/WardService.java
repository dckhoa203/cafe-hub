package com.cafehub.api.service;

import com.cafehub.api.config.Keys;
import com.cafehub.api.domain.district.DistrictRepository;
import com.cafehub.api.domain.ward.Ward;
import com.cafehub.api.domain.ward.WardRepository;
import com.cafehub.api.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardService {
    private final WardRepository wardRepository;
    private final DistrictRepository districtRepository;

    @Autowired
    public WardService(final WardRepository wardRepository, final DistrictRepository districtRepository) {
        this.wardRepository = wardRepository;
        this.districtRepository = districtRepository;
    }

    public List<Ward> getByDistrict(final int districtId) {
        var optionalDistrict = districtRepository.getById(districtId);
        optionalDistrict.orElseThrow(() -> new DataNotFoundException(
                String.format(Keys.Messages.DISTRICT_NOT_FOUND, districtId)));
        return wardRepository.getByDistrict(districtId);
    }

    public Ward getById(final int id) {
        var optionalWard = wardRepository.getById(id);
        return optionalWard.orElseThrow(() -> new DataNotFoundException(String.format(Keys.Messages.WARD_NOT_FOUND, id)));
    }
}
