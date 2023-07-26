package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("One", "First", (byte) 1);
        userDaoHibernate.saveUser("Two", "Second", (byte) 2);
        userDaoHibernate.saveUser("Three", "Third", (byte) 3);
        userDaoHibernate.saveUser("Four", "Fourth", (byte) 4);
        userDaoHibernate.getAllUsers();
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}