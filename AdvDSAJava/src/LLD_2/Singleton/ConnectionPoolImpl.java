package LLD_2.Singleton;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPoolImpl instance;
    private static int maxConnections;
    private static Queue<DatabaseConnection> connectionsQueue;

    private ConnectionPoolImpl(int maxConnections) {
        this.connectionsQueue = new LinkedList<DatabaseConnection>();
        this.maxConnections = maxConnections;
        initializePool();
    }

    public static ConnectionPoolImpl getInstance(int maxConnection) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnection);
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            connectionsQueue.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        return connectionsQueue.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connectionsQueue.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return connectionsQueue.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}