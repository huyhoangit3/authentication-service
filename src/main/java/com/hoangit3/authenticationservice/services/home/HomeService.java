package com.hoangit3.authenticationservice.services.home;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HomeService {
    public Map<String, String> homeData() {
        Map<String, String> data = new HashMap<>();
        data.put("home", "Home data");
        return data;
    }
}
