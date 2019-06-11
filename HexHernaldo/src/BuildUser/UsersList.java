
package BuildUser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
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
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe);
        }
    }
    
    public void addUser(User u) throws BuilderException {
        String name;
        if(this.list.containsKey(u.getName())) {
            throw new BuilderException("Ya existe este nombre de usuario");
        } else {
            name = u.getName();
            this.list.put(u.getName(), u);
            properties.setProperty(name, u.getPassword());
            toSavePropertie();
        }
    }
    
    public User findUserLogin(User u) throws BuilderException {
        if(containsUser(u.getName())) {
            if (this.list.get(u.getName()).getPassword().equals(u.getPassword())) {
               return this.list.get(u.getName()); 
            } else {
                throw new BuilderException("Contraseña incorrecta");
            }
        } else {
            throw new BuilderException("El usuario no existe");
        }
    }
    
    public boolean containsUser(String name) {
        return (this.list.containsKey(name))? true : false;
    }
    
    public void importFile() {
        for (Enumeration e = properties.keys(); e.hasMoreElements();) {
            Object obj = e.nextElement();
//            System.out.println(obj + ": " + properties.getProperty(obj.toString()));
            this.list.put(obj.toString(), new User(obj.toString(), this.properties.getProperty(obj.toString())));
        }
    }
    
    public void toSavePropertie() {
         try {
            this.output = new FileOutputStream(this.file);
            properties.store(this.output, "Datos2");
        } catch (IOException ioe) {
             JOptionPane.showMessageDialog(null, ioe);
        }
    }
    
    public String print() {
        String text = "";
        Iterator i = this.list.values().iterator();
        while (i.hasNext()){
            text += i.next().toString();
        }
        return text;
    }
    
    public void prueba() {
        this.properties.setProperty("servidor.nombre", "GatoLoco");
        this.properties.setProperty("servidor.nombre2", "hola");
        this.properties.setProperty("servidor.nombre3", "loco");
        toSavePropertie();
    }
    
    
}
