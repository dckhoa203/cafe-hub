package com.cafehub.api.controller.district;

import com.cafehub.api.config.Keys;
import com.cafehub.api.exception.InvalidParameterException;
import com.cafehub.api.service.DistrictService;
import com.cafehub.api.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DistrictController {
    private final DistrictService districtService;
    private final DistrictResponseFactory responseFactory;

    @Autowired
    public DistrictController(final DistrictService districtService, final DistrictResponseFactory responseFactory) {
        this.districtService = districtService;
        this.responseFactory = responseFactory;
    }

    @GetMapping(Keys.ApiPath.DISTRICT_GET_BY_PROVINCE_ID_PATH)
    public List<DistrictResponse> getByProvince(@Valid final DistrictGetByProvinceRequest request,
                                                final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(Utils.getErrorMessage(bindingResult));
        }
        var districts = districtService.getByProvince(Integer.parseInt(request.getProvinceId()));
        return responseFactory.toDistrictResponses(districts);
    }

    @GetMapping(Keys.ApiPath.DISTRICT_GET_BY_ID_PATH)
    public DistrictResponse getById(@Valid final DistrictGetByIdRequest request, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(Utils.getErrorMessage(bindingResult));
        }
        var district = districtService.getById(Integer.parseInt(request.getId()));
        return responseFactory.districtResponse(district);
    }
}
