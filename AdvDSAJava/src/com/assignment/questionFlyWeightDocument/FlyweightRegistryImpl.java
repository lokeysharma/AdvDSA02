package com.assignment.questionFlyWeightDocument;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry {
    private Map<String,UserIntrinsicState> registryData = new HashMap<>();
    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        registryData.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return registryData.get(email);
    }
}
