package com.route.findshortestpathbfs.feign;

import com.route.findshortestpathbfs.model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="country-route-api", url="https://raw.githubusercontent.com/mledoze/countries")
public interface CountryRouteFeign {

    @GetMapping(path = "/master/countries.json")
    List<Country> fetchCountries();
}
