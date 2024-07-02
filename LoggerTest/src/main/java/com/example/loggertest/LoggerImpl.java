import org.springframework.boot.logging.LogLevel;
import  java.io.*;

public class LoggerImpl implements Logger {

    private static LoggerImpl instance;
    private String filePath;
    private PrintWriter pw;

    private LoggerImpl(){

    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized(LoggerImpl.class){
                if(instance == null)
                    instance = new LoggerImpl();
            }
        }
        return instance;
    }

    public void resetInstance(){
        instance = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if(this.pw== null) {
            throw new IllegalStateException();
        }
        this.pw.append(level.toString());
        this.pw.append(message);
    }

    @Override
    public void setLogFile(String filePath) {

        try {
            this.filePath = filePath;
            this.pw = new PrintWriter(filePath);
        }
        catch (FileNotFoundException e) {}

    }

    @Override
    public String getLogFile() {
        return this.filePath;
    }

    @Override
    public void flush() {
        this.pw.flush();
    }

    @Override
    public void close() {
        this.pw.close();
    }
}