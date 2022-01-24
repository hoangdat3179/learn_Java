package controller;

import database.ConnectJDBC;
import model.Gender;
import model.User;
import service.UserService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    UserService service;
    ConnectJDBC connectJDBC;
    Connection conn;
    ArrayList<User> listUser;
    Scanner sc;

    public Controller(){
        service = new UserService();
        connectJDBC= new ConnectJDBC();
        conn = connectJDBC.connect();
        listUser = service.getAllUser(conn);
        sc = new Scanner(System.in);
    }

    public void show(){
        for(User u :listUser){
            System.out.println(u);
        }
    }
    public void addUser(){
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Gender: ");
        Gender gender = getGender();
        System.out.println("Password: ");
        String password = sc.nextLine();
        service.addNewUser(conn,username,gender,password);
    }

    public Gender getGender(){
        Gender gender = null;
        System.out.println("1 - male");
        System.out.println("2 - female");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                gender = Gender.male;
                break;
            case 2:
                gender = Gender.female;
                break;
        }
        return gender;
    }

    public void getUserByID(){
        System.out.println("ID: ");
        String id = sc.nextLine();
        service.searchById(conn,id);
    }

    public void updateUsername(){
        System.out.println("New username: ");
        String newusername = sc.nextLine();
        service.updateUsername(conn,newusername);
    }
}
