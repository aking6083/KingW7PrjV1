/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Business.AuthenticationMgr;
import domain.Login;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class AuthenticationSVCSocketImpl implements IAuthenticationSVC {
       
    
    @Override
    public boolean authenticate(Login l) {
        try 
        {
            AuthenticationMgr newAuthMgr = new AuthenticationMgr();
            return newAuthMgr.authenticate(l);
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(AuthenticationSVCSocketImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
