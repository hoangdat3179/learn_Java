package service;

import model.Gender;
import model.User;
import util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(Connection conn){
        String query = "select * FROM users";
        ArrayList<User> users = new ArrayList<>();

        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String password = rs.getString("password");

                users.add(new User(id,username,gender,password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addNewUser(Connection conn, String username, Gender gender, String password){
        String id = Util.randomId(5);
        String query = "insert into users (id, username, gender, password)" + "values ('"+id+"','"+username+"','"+gender+"','"+password+"')";
        //Tạo truy vấn
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Thêm mới thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public User searchById(Connection conn,String newid){
        String query = "select * from users where users.id ='"+newid+"'";
        User user = null;
        try {
            //Tạo truy vấn
            Statement stm = conn.createStatement();

            //Thực thi truy vấn
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                String password = rs.getString("password");

                user = new User(id,username,gender,password);
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void show(ArrayList<User> list){
        for (User user : list){
            System.out.println(list);
        }
    }

    public User updateUsername(Connection conn , String newUsername){
        String query = "UPDATE users \n" +
                "SET username = '"+newUsername+"' \n" +
                "WHERE id = '123'";
        User user = null;
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
