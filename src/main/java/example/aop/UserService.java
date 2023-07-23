package example.aop;

import org.springframework.stereotype.Service;

@Service

public interface UserService {
    public void register();
    public void login();
}
