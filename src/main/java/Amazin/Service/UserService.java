package Amazin.Service;

import Amazin.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
