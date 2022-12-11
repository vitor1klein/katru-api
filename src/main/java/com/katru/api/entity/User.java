package com.katru.api.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "tb_user")
@Entity
public class User {

    @Id
    @Column(name = "id_user")
    @SequenceGenerator(name = "sq_user", sequenceName = "sq_user", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
    private Long id;

    @Column(name = "cpf_user", length = 11, nullable = false)
    private String userCPF;

    @Column(name = "first_name", length = 60, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 60, nullable = false)
    private String lastName;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "dt_creation", nullable = false)
    private LocalDateTime dtCreation;

    @Column(name = "dt_update")
    private LocalDateTime dtUpdate;   
  
}