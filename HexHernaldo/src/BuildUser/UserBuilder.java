
package BuildUser;

import com.sun.net.httpserver.Filter;
import org.apache.commons.codec.digest.DigestUtils;

/*
 * @author Vindas
 */
public class UserBuilder implements InterfaceBuilder {
    
    private User newUser = new User();
    
    /**
     * 
     * @param name
     * Verifies: if the name is not null,
     * has or not especials characters,
     * if the first character is not a letter and 
     * verifies if the name has a length between 4 and 8 characters
     */
    @Override
    public void getName(String name) throws BuilderException{
        if (name == null) {
            throw new BuilderException("No se ha ingresado ningún nombre");
        }
        if(hasSpecialsCharacters(name)) {
            throw new BuilderException("El nombre solo puede tener letras y números");
        }
        if (!Character.isLetter(name.charAt(0))) {
            throw new BuilderException("El primer caracter del nombre debe de ser una letra");
        }
        if (name.length() < 4 || name.length() > 8) {
            throw new BuilderException("El nombre debe tener entre 4 y 8 caracteres");
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
    public void getPassword(String password) throws BuilderException{
        if (password == null) {
            throw new BuilderException("No se ha ingresado ninguna contraseña");
        }
        if (password.length() < 4 || password.length() > 8) {
            throw new BuilderException("La contraseña debe tener entre 4 y 8 caracteres\n");
        }
        if(hasSpecialsCharacters(password)) {
            throw new BuilderException("La contraseña solo puede tener letras y números\n");
        }
//        this.newUser.setPassword(DigestUtils.md5Hex(password));
    }

    @Override
    public User getUser() {
        return this.newUser;
    }
    
    /**
     * @param text
     * @return
     * If the name has a special character
     * returns tre else returns fsalse
     */
    static boolean hasSpecialsCharacters(String text) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < nums.length; j++) {
                if (!Character.isLetter(text.charAt(i)) && text.charAt(i) != nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
