package com.cafehub.api.service;

import com.cafehub.api.config.Keys;
import com.cafehub.api.domain.district.District;
import com.cafehub.api.domain.district.DistrictRepository;
import com.cafehub.api.domain.province.ProvinceRepository;
import com.cafehub.api.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    private final DistrictRepository districtRepository;
    private final ProvinceRepository provinceRepository;

    @Autowired
    public DistrictService(final DistrictRepository districtRepository, final ProvinceRepository provinceRepository) {
        this.districtRepository = districtRepository;
        this.provinceRepository = provinceRepository;
    }

    public List<District> getByProvince(final int provinceId) {
        var optionalProvince = provinceRepository.getById(provinceId);
        optionalProvince.orElseThrow(() -> new DataNotFoundException(
                String.format(Keys.Messages.PROVINCE_NOT_FOUND, provinceId)));
        return districtRepository.getByProvince(provinceId);
    }

    public District getById(final int id) {
        var districtOptional = districtRepository.getById(id);
        return districtOptional.orElseThrow(() -> new DataNotFoundException(
                String.format(Keys.Messages.DISTRICT_NOT_FOUND, id)));
    }
}
