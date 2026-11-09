package org.repository;

import org.models.User;

import java.util.ArrayList;

public class UserRepository {

    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(User users) {
        UserRepository.users.add(users);
    }
}
