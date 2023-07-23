package example.mybatis;


public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println(user.getName()+"save");
    }
}
