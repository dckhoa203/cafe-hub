package com.cafehub.api.service;

import com.cafehub.api.config.Keys;
import com.cafehub.api.domain.province.Province;
import com.cafehub.api.domain.province.ProvinceRepository;
import com.cafehub.api.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {
    private final ProvinceRepository provinceRepository;

    @Autowired
    public ProvinceService(final ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public List<Province> getAll() {
        return provinceRepository.getAll();
    }

    public Province getById(final int id) {
        final Optional<Province> provinceOptional = provinceRepository.getById(id);
        return provinceOptional.orElseThrow(() -> new DataNotFoundException(
                String.format(Keys.Messages.PROVINCE_NOT_FOUND, id)));
    }
}
