
package BuildUser;

import com.sun.net.httpserver.Filter;
import org.apache.commons.codec.digest.DigestUtils;

/*
 * @author Vindas
 */
public class UserBuilder implements InterfaceBuilder {
    
    private User newUser;
    private String exception = "";
    
    /**
     * 
     * @param name
     * Verifies: if the name is not null,
     * has or not especials characters,
     * if the first character is not a letter and 
     * verifies if the name has a length between 4 and 8 characters
     */
    @Override
    public void getName(String name) {
        if (name == null) {
            this.exception = "No se ha ingresado ningún nombre\n";
        }
        if(hasSpecialsCharacters(name)) {
            this.exception = "El nombre solo puede tener letras y números\n";
        }
        if (!Character.isLetter(name.charAt(0))) {
            this.exception = "El primer caracter del nombre debe de ser una letra\n";
        }
        if (name.length() < 4 || name.length() > 8) {
            this.exception = "El nombre debe tener entre 4 y 8 caracteres\n";
        }
        if (false) { //No debe ser igual al de otro jugador
            this.exception = "Este nombre de usuario ya existe\n";
        }
        this.newUser.setName(name);
    }
    
    /**
     * 
     * @param password
     * Verifies: if the password is null,
     * if the name has a length between 4 and 8 characters,
     * if has not specials characters and encrypts the password
     */
    @Override
    public void getPassword(String password) {
        if (password == null) {
            this.exception = "No se ha ingresado ninguna contraseña";
        }
        if (password.length() < 4 || password.length() > 8) {
            this.exception = "La contraseña debe tener entre 4 y 8 caracteres\n";
        }
        if(hasSpecialsCharacters(password)) {
            this.exception = "La contraseña solo puede tener letras y números\n";
        }
        this.newUser.setPassword(DigestUtils.md5Hex(password));
    }

    @Override
    public User getUser() throws BuilderException{
        if(this.exception == "") {
            return this.newUser;
        } else {
            throw new BuilderException(this.exception);
        }
    }
    
    /**
     * @param text
     * @return
     * If the name has a special character
     * returns tre else returns fsalse
     */
    public boolean hasSpecialsCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(!Character.isLetter(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
