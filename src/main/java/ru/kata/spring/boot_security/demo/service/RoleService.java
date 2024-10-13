package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    // Метод для получения всех ролей
    List<Role> findAll();

    // Метод для получения всех ролей с подгруженными пользователями
    Set<Role> findAllWithUsers();
}
