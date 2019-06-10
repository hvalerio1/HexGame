
package BuildUser;

/*
 * @author Vindas
 */
public interface InterfaceBuilder {
    void getName(String name);
    void getPassword(String password);
    User getUser() throws BuilderException;
}
