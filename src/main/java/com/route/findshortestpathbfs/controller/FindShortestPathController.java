package com.route.findshortestpathbfs.controller;

import com.route.findshortestpathbfs.payload.request.RouteRequest;
import com.route.findshortestpathbfs.payload.response.RouteResponse;
import com.route.findshortestpathbfs.service.FindShortestPathService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FindShortestPathController {

    private final FindShortestPathService findShortestPathService;

    @GetMapping("/route")
    public ResponseEntity<RouteResponse> calculateLandRoute(@RequestBody RouteRequest routeRequest) {

        log.info("FindShortestPathController | calculateLandRoute is working");

        String from = routeRequest.getFrom();
        String to = routeRequest.getTo();

        log.info("FindShortestPathController | calculateLandRoute | from : " +from);
        log.info("FindShortestPathController | calculateLandRoute | to : " + to);

        return new ResponseEntity<RouteResponse>(findShortestPathService.findShortestPath(from,to), HttpStatus.OK);
    }
}
