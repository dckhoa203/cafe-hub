package com.cafehub.api.repository.district;

import com.cafehub.api.domain.district.District;
import com.cafehub.api.domain.district.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DistrictRepositoryImpl implements DistrictRepository {
    private final DistrictMapper districtMapper;

    @Autowired
    public DistrictRepositoryImpl(DistrictMapper districtMapper) {
        this.districtMapper = districtMapper;
    }

    @Override
    public List<District> getByProvince(final int provinceId) {
        return districtMapper.getByProvince(provinceId);
    }

    @Override
    public Optional<District> getById(final int id) {
        return Optional.ofNullable(districtMapper.getById(id));
    }
}
