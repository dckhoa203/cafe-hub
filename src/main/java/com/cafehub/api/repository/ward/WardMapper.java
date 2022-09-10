package com.cafehub.api.repository.ward;

import com.cafehub.api.domain.ward.Ward;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface WardMapper {
    @Select("SELECT wards.id, wards.name, wards.gso_id AS gsoId, districts.name AS districtName " +
            "FROM wards JOIN districts ON wards.district_id = districts.id AND districts.is_deleted = 0 " +
            "WHERE wards.district_id=#{districtId} AND wards.is_deleted = 0")
    List<Ward> getByDistrict(@Param("districtId") final int districtId);

    @Select("SELECT wards.id, wards.name, wards.gso_id AS gsoId, districts.name AS districtName " +
            "FROM wards JOIN districts ON wards.district_id = districts.id AND districts.is_deleted = 0 " +
            "WHERE wards.id=#{id} AND wards.is_deleted = 0")
    Ward getById(@Param("id") final int id);
}
