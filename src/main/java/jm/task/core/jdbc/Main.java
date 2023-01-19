package jm.task.core.jdbc;

import java.util.List;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Don", "Rocket", (byte) 20);
        userDao.saveUser("Nick", "Samall", (byte) 25);
        userDao.saveUser("Vodka", "Seledka", (byte) 31);
        userDao.saveUser("Rroor", "Pass", (byte) 38);

        List<User> printList = userDao.getAllUsers();
        printList.forEach(System.out :: println);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
