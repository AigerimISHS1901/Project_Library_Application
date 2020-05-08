package sample;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;

public class ServerRunnable extends Thread{

    private Socket socket;
    public ServerRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try
        {
            DatabaseHandler handler=new DatabaseHandler();
            handler.getDbConnection();

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            PackageData pd = null;
            while ( (pd=(PackageData)inStream.readObject())!=null) {
                if (pd.getOperationType().equals("SignUpUser")) {
                    User userFromUser = pd.getUser();
                    handler.signUpUser(userFromUser);
                }
            }


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