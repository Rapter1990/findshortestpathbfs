package com.route.findshortestpathbfs.payload.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class RouteRequest {
    private String from;
    private String to;
}
