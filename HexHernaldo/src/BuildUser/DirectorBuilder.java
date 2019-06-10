
package BuildUser;

/*
 * @author Vindas
 */
public class DirectorBuilder {

    public DirectorBuilder() {
    }
    
    public User createUser(InterfaceBuilder builder, UsersList list,String name, String password) throws BuilderException {
        if(builder == null) {
            builder = new UserBuilder();
        } 
        builder.getName(name, list);
        builder.getPassword(password);
        return builder.getUser();
    }
}
