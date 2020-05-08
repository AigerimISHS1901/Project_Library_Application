package sample;

import java.io.*;
import java.util.*;

public class PackageData implements Serializable {
    private String operationType;
    private User user;
    private ArrayList<User> users;

    public PackageData(String operationType, User user) {
        this.operationType = operationType;
        this.user = user;
    }

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(ArrayList<User> users) {
        this.users = users;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}