package LLD_2.Singleton;

import java.util.Optional;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl instance;
    private FileBasedConfigurationManagerImpl(){
        super();
    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        return getProperties().getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        String conf =  getConfiguration(key);
        return Optional.ofNullable(conf).map(v -> convert(conf,type)).orElse(null);
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        getProperties().setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        String val = value.toString();
        setConfiguration(key, val);
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        getProperties().remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
  }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(instance == null){
            synchronized (FileBasedConfigurationManagerImpl.class){
                if(instance == null){
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        instance = null;
    }

}