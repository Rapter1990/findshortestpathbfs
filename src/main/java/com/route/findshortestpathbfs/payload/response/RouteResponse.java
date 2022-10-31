package com.route.findshortestpathbfs.payload.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class RouteResponse {

    private List<String> routeList;
}
