package com.example.danielpalacio.UI;

public class Profile {
    private Network _network;
    private String first;
    private String last;
    private int id;
    public Profile(String firstName,String lastName, int identification, Network pool){
        first = firstName;
        last = lastName;
        _network = pool;
        id = identification;
    }

    public String getFirstName(){
        return first;
    }
    public String getLastName(){
        return last;
    }
    public String getFullName(){
        String name = first + " " + last;
        return name;
    }
    public Network getNetwork(){
        return _network;
    }
    public int getID(){
        return id;
    }
    public void setFirstName(String name){
        first = name;
    }
    public void setLastName(String name){
        last = name;
    }
}
