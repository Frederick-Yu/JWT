package com.frederick.jwt.form;

import com.frederick.core.util.StringUtil;
import com.frederick.jwt.Entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserForm {

    private String emailOrPhone;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private UserEntity.UserType userType;

    public void setEmailOrPhone(String emailOrPhone) {
        this.emailOrPhone = emailOrPhone;

        if (StringUtil.isEmail(emailOrPhone)) {
            this.email = emailOrPhone;
            this.userType = UserEntity.UserType.EMAIL;
        } else if (StringUtil.isPhoneNumber(emailOrPhone)) {
            this.phone = emailOrPhone;
            this.userType = UserEntity.UserType.PHONE;
        }
    }
}
