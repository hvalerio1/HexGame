package dataSet;

import java.io.Serializable;


public class UserList implements Serializable {

    private User[] userList;
    private int counter;

    public UserList() {
        userList = new User[100];
    }

    public int getSize() {
        return counter;
    }

    public User getStudent(int index) {
        return userList[index];
    }

    public void addUser(User user) {
        userList[counter++] = user;
    }

    public String getListString() {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text += userList[i] + "\n";
        }
        return text;
    }
    
//    public boolean comparate(){
//        boolean result = false;
//        for (int i = 0; i < userList.length; i++) {
//            
//        }
//    }

    public User[] getUserList() {
        return userList;
    }
}
