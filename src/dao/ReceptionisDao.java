/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.DuplicateUsernameException;
import java.util.List;
import model.Receptionist;

/**
 *
 * @author Lenovo
 */
public interface ReceptionisDao {
    
    Receptionist getReceptionist(String username, String password);
    
    List<Receptionist> getAllReceptionists();
    
    boolean addReceptionist(Receptionist receptionist) throws DuplicateUsernameException;
    
    Receptionist getReceptionistById(int id);
    
    boolean updateReceptionistById(Receptionist receptionist, boolean usernameChanged) throws DuplicateUsernameException;
    
    boolean deleteReceptionistById(int id);
    
    boolean updateLastLoginDate(Receptionist receptionist);
    
    boolean updatePassword(Receptionist receptionist);
};
