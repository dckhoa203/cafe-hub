package com.cafehub.api.controller.province;

import com.cafehub.api.config.Keys;
import com.cafehub.api.domain.province.Province;
import com.cafehub.api.exception.InvalidParameterException;
import com.cafehub.api.service.ProvinceService;
import com.cafehub.api.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProvinceController {
    private final ProvinceService provinceService;
    private final ProvinceResponseFactory responseFactory;


    @Autowired
    public ProvinceController(final ProvinceService provinceService,
                              final ProvinceResponseFactory responseFactory) {
        this.provinceService = provinceService;
        this.responseFactory = responseFactory;
    }

    @GetMapping(Keys.ApiPath.GET_ALL_PROVINCE_PATH)
    public List<ProvinceResponse> getAll() {
        final List<Province> provinces = provinceService.getAll();
        return responseFactory.toProvinceResponses(provinces);
    }

    @GetMapping(Keys.ApiPath.PROVINCE_GET_BY_ID_PATH)
    public ProvinceResponse getById(@Valid final ProvinceGetByIdRequest request, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(Utils.getErrorMessage(bindingResult));
        }
        final Province province = provinceService.getById(Integer.parseInt(request.getId()));
        return responseFactory.toProvinceResponse(province);
    }
}
