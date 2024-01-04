package com.frederick.jwt.Entity;

import com.frederick.core.base.BaseEntity;
import com.frederick.jwt.form.UserForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor @Getter
public class UserEntity extends BaseEntity {

    public UserEntity(UserForm form) {
        this.userKey = form.getEmailOrPhone();
        this.email = form.getEmail();
        this.phone = form.getPhone();
        this.name = form.getName();
        this.userName = form.getUserName();
        this.password = form.getPassword();
        this.userType = form.getUserType();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userKey;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    private String name;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public enum UserType {
        EMAIL, PHONE
    }


}
