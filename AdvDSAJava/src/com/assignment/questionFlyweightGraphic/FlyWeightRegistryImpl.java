package com.assignment.questionFlyweightGraphic;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightRegistryImpl implements FlyweightRegistry{
    Map<GraphicType,GraphicIntrinsicState> registryMap = new HashMap<GraphicType,GraphicIntrinsicState>();
    @Override
    public void addFlyweight(GraphicIntrinsicState flyweight) {
        registryMap.put(flyweight.getGraphicType(),flyweight);
    }

    @Override
    public GraphicIntrinsicState getFlyweight(GraphicType graphicType) {
        return registryMap.get(graphicType);
    }
}
