package sky.pro.homeworktests.services;

public interface UserDao {
    public String add(String name);

    String remove(String name);

    String findAllUsers();
}
