package com.example.guardience.ChatModule;

import java.util.HashMap;
import java.util.Map;

public class ChatModel {
    public Map<String, Boolean> users = new HashMap<>();
    public Map<String, Chat> chats = new HashMap<>();

    public static class Chat{
        public String name;
        public String msg;
        public Object timestamp;

        public String getName() { return name;}
        public void setName(String name) {this.name = name;}
        public String getMsg() { return  msg; }
        public void setMsg(String msg) { this.msg = msg;}
    }

}
