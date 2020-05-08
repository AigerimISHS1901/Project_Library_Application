package sample;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;

public class ServerRunnable extends Thread{

    private Socket socket;
    public ServerRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try
        {

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());


            inStream.close();
            outStream.close();
            socket.close();
            System.exit(0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}