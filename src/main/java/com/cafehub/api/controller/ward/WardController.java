package com.cafehub.api.controller.ward;

import com.cafehub.api.config.Keys;
import com.cafehub.api.domain.ward.Ward;
import com.cafehub.api.exception.InvalidParameterException;
import com.cafehub.api.service.WardService;
import com.cafehub.api.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WardController {
    private final WardService wardService;
    private final WardResponseFactory responseFactory;

    @Autowired
    public WardController(final WardService wardService, final WardResponseFactory responseFactory) {
        this.wardService = wardService;
        this.responseFactory = responseFactory;
    }

    @GetMapping(Keys.ApiPath.WARD_GET_BY_DISTRICT_ID_PATH)
    public List<WardResponse> getByDistrict(@Valid final WardGetByDistrictRequest request,
                                            final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(Utils.getErrorMessage(bindingResult));
        }
        final List<Ward> wards = wardService.getByDistrict(Integer.parseInt(request.getDistrictId()));
        return responseFactory.toWardResponses(wards);
    }

    @GetMapping(Keys.ApiPath.WARD_GET_BY_ID_PATH)
    public WardResponse getById(@Valid final WardGetByIdRequest request, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(Utils.getErrorMessage(bindingResult));
        }
        final Ward ward = wardService.getById(Integer.parseInt(request.getId()));
        return responseFactory.toWardResponse(ward);
    }
}
