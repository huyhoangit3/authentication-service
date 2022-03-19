package com.hoangit3.authenticationservice.services.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    public Map<String, String> userData() {
        Map<String, String> data = new HashMap<>();
        data.put("user", "User data");
        return data;
    }
}
