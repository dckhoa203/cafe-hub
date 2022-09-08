package com.cafehub.api.repository.ward;

import com.cafehub.api.domain.ward.Ward;
import com.cafehub.api.domain.ward.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WardRepositoryImpl implements WardRepository {
    private final WardMapper wardMapper;

    @Autowired
    public WardRepositoryImpl(final WardMapper wardMapper) {
        this.wardMapper = wardMapper;
    }

    @Override
    public List<Ward> getByDistrict(final int districtId) {
        return wardMapper.getByDistrict(districtId);
    }
}
