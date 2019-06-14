
package BuildUser;

/*
 * @author Vindas
 */
public interface InterfaceBuilder {
    void getName(String name) throws BuilderException;
    void getPassword(String password) throws BuilderException;
    User getUser();
}
