package com.ead.authuser.services;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.specifications.SpecificationTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {


    List<UserModel> findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UserModel userModel);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    void save(UserModel userModel);


    Page<UserModel> findAll(SpecificationTemplate.UserSpec spec, Pageable pageable);

    Page<UserModel> findAll(Pageable pageable);


}