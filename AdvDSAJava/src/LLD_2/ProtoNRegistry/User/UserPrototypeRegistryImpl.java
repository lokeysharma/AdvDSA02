package LLD_2.ProtoNRegistry.User;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    HashMap<UserType, User> usersMap;

    public UserPrototypeRegistryImpl() {
        usersMap = new HashMap<>();

    }
    @Override
    public void addPrototype(User user) {
        usersMap.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return usersMap.get(type);
    }

    @Override
    public User clone(UserType type) {
        return usersMap.get(type).cloneObject();
    }
}
