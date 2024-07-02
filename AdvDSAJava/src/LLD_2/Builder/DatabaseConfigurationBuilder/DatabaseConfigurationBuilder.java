package LLD_2.Builder.DatabaseConfigurationBuilder;

public class DatabaseConfigurationBuilder {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public void setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public void setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public void setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public void setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
        }

        public DatabaseConfigurationBuilder build() {
            DatabaseConfigurationBuilder builder = new DatabaseConfigurationBuilder();
            builder.databaseUrl = this.getDatabaseUrl();
            builder.username = this.getUsername();
            builder.password = this.getPassword();
            builder.maxConnections = this.getMaxConnections();
            builder.enableCache = this.isEnableCache();
            builder.isReadOnly = this.isReadOnly();
            return builder;
        }
    }
}
