/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.RootUser;

/**
 *
 * @author Lenovo
 */
public interface RootUserDao {
    
    RootUser getRootUser(String username, String password);
    
    boolean updateLastLoginDate(RootUser rootUser);
}
