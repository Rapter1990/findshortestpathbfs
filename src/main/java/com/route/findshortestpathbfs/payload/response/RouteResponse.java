package com.route.findshortestpathbfs.payload.response;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
public class RouteResponse {

    private List<String> routeList;
}
