package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserRepository;
import com.ead.authuser.services.UserService;
import com.ead.authuser.specifications.SpecificationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> findAll() {
        List<UserModel> all = userRepository.findAll();
        return all;
    }

    @Override
    public Optional<UserModel> findById(UUID userId) {
        Optional<UserModel> user = userRepository.findById(userId);
        return user;
    }

    @Override
    public void delete(UserModel userModel) {
        userRepository.delete(userModel);
    }

    @Override
    public boolean existsByUsername(String username) {
        boolean exists = userRepository.existsByUsername(username);
        return exists;
    }

    @Override
    public boolean existsByEmail(String email) {
        boolean exists = userRepository.existsByEmail(email);
        return exists;
    }

    @Override
    public void save(UserModel userModel) {
        UserModel user = userRepository.save(userModel);

    }

    @Override
    public Page<UserModel> findAll(SpecificationTemplate.UserSpec spec, Pageable pageable) {
        return userRepository.findAll(spec, pageable);
    }

    @Override
    public Page<UserModel> findAll(Pageable pageable) {
        Page<UserModel> page = userRepository.findAll(pageable);
        return page;
    }

}
