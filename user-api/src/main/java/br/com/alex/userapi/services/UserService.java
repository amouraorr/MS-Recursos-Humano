package br.com.alex.userapi.services;

import br.com.alex.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}