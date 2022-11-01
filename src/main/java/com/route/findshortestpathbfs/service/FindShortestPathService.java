package com.route.findshortestpathbfs.service;

import com.route.findshortestpathbfs.bts.BFSAlgorithm;
import com.route.findshortestpathbfs.exception.RouteNotFoundException;
import com.route.findshortestpathbfs.feign.CountryRouteFeign;
import com.route.findshortestpathbfs.model.Country;
import com.route.findshortestpathbfs.payload.response.RouteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class FindShortestPathService {

    private final CountryRouteFeign countryRouteFeign;

    public RouteResponse findShortestPath(String from, String to) {

        log.info("FindShortestPathService | findShortestPath is working");

        List<Country> countries = countryRouteFeign.fetchCountries();

        log.info("FindShortestPathService | findShortestPath | countries :  " + countries.size());

        Map<String, Country> countryMap = countries.stream().collect(Collectors.toMap(route -> route.getCca3(), it -> it));

        log.info("FindShortestPathService | findShortestPath | countryMap :  " + countryMap.toString());

        if(from.equals(to)){
            throw new RouteNotFoundException("From and to cannot be equal");
        }

        Country fromCountry = countryMap.get(from);
        Country toCountry = countryMap.get(to);

        log.info("FindShortestPathService | findShortestPath | fromCountry :  " + fromCountry.getCca3());
        log.info("FindShortestPathService | findShortestPath | toCountry :  " + toCountry.getCca3());

        if(fromCountry == null){
            throw new RouteNotFoundException("From cannot be null");
        }

        if(toCountry == null){
            throw new RouteNotFoundException("To cannot be null");
        }

        BFSAlgorithm bfsAlgorithm =new BFSAlgorithm();
        List<String> routes = bfsAlgorithm.shortestPathBFS(fromCountry,toCountry,countryMap);

        RouteResponse routeResponse = RouteResponse.builder()
                .routeList(routes)
                .build();

        return routeResponse;
    }
}
