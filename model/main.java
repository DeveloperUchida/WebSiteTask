package model;

import java.io.Serializable;

public class main implements Serializable {

    private static final Map<String, String> users = new HashMap<>();

    static {
        // 初期ユーザーデータの設定（実際はデータベースから読み込むなど）
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public static boolean authenticateUser(String username, String password) {
        // ユーザーの認証を行う
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public static void registerUser(String username, String password) {
        // ユーザーの新規登録
        users.put(username, password);
    }

    public static void resetPassword(String username, String newPassword) {
        // パスワードリセット
        users.put(username, newPassword);
    }
}

