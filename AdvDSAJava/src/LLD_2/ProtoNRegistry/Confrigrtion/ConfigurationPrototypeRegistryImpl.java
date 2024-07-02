package LLD_2.ProtoNRegistry.Confrigrtion;

import java.util.HashMap;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    HashMap<ConfigurationType,Configuration> cMap;
    public ConfigurationPrototypeRegistryImpl() {
        cMap = new HashMap<>();
    }
    @Override
    public void addPrototype(Configuration user) {
        cMap.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return cMap.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return cMap.get(type).cloneObject();
    }
}
