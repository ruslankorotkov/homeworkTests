package sky.pro.homeworktests.services.impl;

import org.springframework.stereotype.Service;
import sky.pro.homeworktests.exception.ValidationException;
import sky.pro.homeworktests.services.UserDao;

import java.util.LinkedList;
import java.util.List;
@Service
public class UserDaoImpl implements UserDao {
    public List<String> userList = new LinkedList<>();
    @Override
    public String add(String name){
        if(userList.contains(name)){
            throw new ValidationException("Имя уже содержится в листе");
        }
        userList.add(name);
        return name;
    }
    @Override
    public String remove(String name){
        if(userList.contains(name)){
            userList.remove(name);
            return name;
        }
        throw new ValidationException("Имя  несодержится в листе");
    }
    @Override
    public String findAllUsers(){
        return String.valueOf(userList);
    }
}
