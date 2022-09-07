package com.cafehub.api.repository.district;

import com.cafehub.api.domain.district.District;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DistrictMapper {
    @Select("SELECT districts.id, districts.name, districts.gso_id AS gsoId, provinces.name AS provinceName " +
            "FROM districts JOIN provinces ON districts.province_id = provinces.id AND provinces.is_deleted = 0 " +
            "WHERE districts.province_id=#{provinceId} AND districts.is_deleted = 0")
    List<District> getByProvince(@Param("provinceId") final int provinceId);

    @Select("SELECT districts.id, districts.name, districts.gso_id AS gsoId, provinces.name AS provinceName " +
            "FROM districts JOIN provinces ON districts.province_id = provinces.id AND provinces.is_deleted = 0 " +
            "WHERE districts.id=#{id} AND districts.is_deleted = 0")
    District getById(@Param("id") final int id);
}
