
package BuildUser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/*
 * @author Vindas
 */
public class UsersList {
    private TreeMap <String, User> list;
    private Properties properties;
    private InputStream input;
    private OutputStream output;
    private final String file = "file.properties";
    
    public UsersList() {
        this.list = new TreeMap<>();
        this.properties = new Properties();
        try {
            this.input = new FileInputStream(this.file);
            properties.load(this.input);
            this.output = new FileOutputStream(this.file);
            this.importList();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe);
        }
    }
    
    public void addUser(User u) {
        if(this.list.containsKey(u.getName())) {
            throw BuilderException("");
        } else {
            this.list.put(u.getName(), u);
            properties.setProperty("server." + u.getName(), u.getPassword());
        }
    }
    
    public boolean containsUser(String name) {
        return (this.list.containsKey(name))? true : false;
    }
    
    public void importList() {
        for (Enumeration e = properties.keys(); e.hasMoreElements();) {
            Object obj = e.nextElement();
            System.out.println(obj + ": " + properties.getProperty(obj.toString()));
            list.put(obj.toString(), new User(obj.toString(), this.properties.getProperty(obj.toString())));
        }
    }
    
    public void toSvePropertie() {
         try {
            properties.store(this.output, file);
        } catch (IOException ioe) {
             JOptionPane.showMessageDialog(null, ioe);
        }
    }
}
