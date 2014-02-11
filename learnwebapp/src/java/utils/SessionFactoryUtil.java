/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Rishitha
 */
public class SessionFactoryUtil {
    
    
    static SessionFactory sf = null;
    
    public static SessionFactory getSF(){
        
        if(sf == null ){
          Configuration conf = new Configuration();
          conf.configure();
          sf = conf.buildSessionFactory();
        }
        
        return sf;
        
        
        
        
    }
    
    
    
}
