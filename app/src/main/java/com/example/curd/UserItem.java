package com.example.curd;

public class UserItem {
    String UserId;
    String UserName;
    String UserCountry;

    public UserItem() {
    }

    public UserItem(String userId, String userName, String userCountry) {
        UserId = userId;
        UserName = userName;
        UserCountry = userCountry;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserCountry() {
        return UserCountry;
    }

    public void setUserCountry(String userCountry) {
        UserCountry = userCountry;
    }
}
