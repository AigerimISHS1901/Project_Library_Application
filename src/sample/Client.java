package sample;
import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
    public static  void  main(String[] args){
        try{
            Socket socket=new Socket("127.0.0.1", 1235);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
