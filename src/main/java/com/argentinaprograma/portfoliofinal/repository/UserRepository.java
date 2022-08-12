/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.repository;

import com.argentinaprograma.portfoliofinal.models.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juamp
 */
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}
