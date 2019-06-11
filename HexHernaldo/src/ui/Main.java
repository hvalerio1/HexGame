
package ui;

import BuildUser.DirectorBuilder;
import BuildUser.User;
import BuildUser.UsersList;
import javax.swing.JOptionPane;


/**
 *
 * @author Vindas
 */
public class Main {
    
    public static void main(String[] args) {
//        Index index = new Index();
//        index.setVisible(true);
        UsersList list = new UsersList();
        User u1 = new User("Erick1", "1234");
        User u2 = new User("Erick2", "1234");
        User u3 = new User("Erick3", "1234");
        DirectorBuilder d = new DirectorBuilder();
//        list.importFile();
        
        try {
            list.addUser(d.createUser(null, list, u1.getName(), u1.getPassword()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
//        userList.prueba();
//        userList.importFile();
//        list.importFile();
        System.out.println(list.print());
        
    }
    
}
