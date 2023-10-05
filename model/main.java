package model;

import java.io.Serializable;

public class main implements Serializable {

    private String name;
    private String password;

    public void User() {}

    public void User(String name,String password) {
        this.name = name;
        this.password = password;
    }

    public String getName(){     // 1. ユーザー名取得
        return this.name;
    }

    public String getPassword(){   // 2. パスワード取得
        return this.password;
    }
}

