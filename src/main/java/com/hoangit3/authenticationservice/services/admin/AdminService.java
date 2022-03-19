package com.hoangit3.authenticationservice.services.admin;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminService {
    public Map<String, String> adminData() {
        Map<String, String> data = new HashMap<>();
        data.put("admin", "Admin data");
        return data;
    }
}
