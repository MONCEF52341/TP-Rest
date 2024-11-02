package emsi.moncef.tp_rest.service;

import emsi.moncef.tp_rest.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;
    public UserService() {
        userList = new ArrayList<>();
        User u1 = new User("Mohammed",1,"mhd@mail.com");
        User u2 = new User("Moad",2,"moad@mail.com");
        User u3 = new User("Sana",3,"sana@mail.com");
        User u4 = new User("Ahlam",4,"ahlam@mail.com");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
    }




    public User getUser(Integer id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public boolean deleteUser(Integer id) {
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                return true;
            }
        }
        return false;
    }
    public List<User> getUserList() {
        return userList;
    }

    public boolean addUser(User user) {
        if (user != null && !userList.contains(user)) {
            userList.add(user);
            return true;
        }
        return false;
    }

    public boolean updateUser(Integer id, User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.set(i, user);
                return true;
            }
        }
        return false;
    }
}

