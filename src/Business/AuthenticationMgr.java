/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Service.AuthenticationSVCSocketImpl;
import Service.Factory;
import domain.Login;
import java.io.*;
import java.net.*;

/**
 *
 * @author root
 */
public class AuthenticationMgr {
    
    
    
    public boolean authenticate(Login myLogin) throws Exception
    {
        Socket socket = null;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try 
        {
            socket = new Socket(InetAddress.getLocalHost(), 8000);
            //AuthenticationSVCSocketImpl newAuthSvc = new AuthenticationSVCSocketImpl();
            //Factory authFactory = new Factory();
            //newAuthSvc = authFactory.getSocketAuthService();
            
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
            out.writeObject((Login)myLogin);
            boolean isReal = in.readBoolean();
            
            //System.out.println(authentic);
            
        }
        catch (Exception ioe)
        {
            System.out.println(ioe.getMessage());
            return false;
        }
        return true;
    }
}
