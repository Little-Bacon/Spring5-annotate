package example.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
//    	@Autowired
//    	@Qualifier("userDAOImpl")
    @Resource(name = "userDAOImpl")
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }
//	@Autowired
//    @Qualifier("userDAOImpl")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register() {
        userDAO.save();
    }
}
