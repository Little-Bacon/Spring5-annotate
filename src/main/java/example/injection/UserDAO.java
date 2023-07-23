package example.injection;

import org.springframework.stereotype.Component;

/**
 * @author bacon
 */
@Component
public interface UserDAO {
    public void save();
}
