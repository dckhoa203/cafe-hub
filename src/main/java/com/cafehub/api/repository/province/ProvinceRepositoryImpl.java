package com.cafehub.api.repository.province;

import com.cafehub.api.domain.province.Province;
import com.cafehub.api.domain.province.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProvinceRepositoryImpl implements ProvinceRepository {
    private final ProvinceMapper mapper;

    @Autowired
    public ProvinceRepositoryImpl(final ProvinceMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Province> getAll() {
        return mapper.getAll();
    }

    @Override
    public Optional<Province> getById(final int id) {
        return Optional.ofNullable(mapper.getById(id));
    }
}
