package sky.pro.homeworktests.services.impl;

import org.springframework.stereotype.Service;
import sky.pro.homeworktests.services.UserDao;
import sky.pro.homeworktests.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    public UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(String name) {
        if (userDao.findAllUsers().contains(name)) {
        }
        return true;
    }
}
