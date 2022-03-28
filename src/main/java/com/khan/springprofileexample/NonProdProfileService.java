package com.khan.springprofileexample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default | local | test"})
public class NonProdProfileService implements ProfileService {

    @Override
    public String getMessage() {
        return "NON-PROD message";
    }
}
