package example.aop;

import example.injection.UserDAO;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    /**
     *
     * @return
     */
    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register() {
        System.out.println("save");
    }

    @Override
    public void login() {
        System.out.println("login");
    }
}
