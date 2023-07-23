package example.injection;

import org.springframework.stereotype.Repository;


public class UserDAOImpl implements UserDAO{

    @Override
    public void save() {
        System.out.println("save");
    }
}
