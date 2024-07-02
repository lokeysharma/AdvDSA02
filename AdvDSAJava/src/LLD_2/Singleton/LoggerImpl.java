package LLD_2.Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {
    private static LoggerImpl instance;
    private String filePath;
    private PrintWriter writer;
    private LoggerImpl() {
        super();
    }

    public static LoggerImpl getInstance() {
        if (instance == null) {
            synchronized (LoggerImpl.class) {
                if (instance == null) {
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance(){
        instance = null;
    }

    @Override
    public void log(String level, String message) {
        if(this.writer == null){
            throw new IllegalStateException("filePath is null");
        }


        LocalDateTime timeStamp = LocalDateTime.now();
        String formttedmsg = "[ " + timeStamp.toString() + " ] " + level + ": " + message;
        writer.println(formttedmsg);
    }

    @Override
    public void setLogFile(String filePath) {
        this.filePath = filePath;
        try {
            close();
            this.filePath = filePath;
            writer = new PrintWriter(new FileWriter(filePath,true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getLogFile() {
        return this.filePath;
    }

    @Override
    public void flush() {
        if(this.writer != null)
            this.writer.flush();
    }

    @Override
    public void close() {
        if(this.writer != null) {
            this.writer.close();
            this.writer = null;
        }

    }
}