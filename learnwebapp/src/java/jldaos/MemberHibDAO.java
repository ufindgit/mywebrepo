/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jldaos;

import form.RegistrationForm;
import jldaos.MemberDAOI;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tos.MemberTo;
import utils.SessionFactoryUtil;

/**
 *
 * @author Rishitha
 */
public class MemberHibDAO implements MemberDAOI {

    public MemberHibDAO() {
    }

    public void registerMember(MemberTo mem) {

        Session ses = SessionFactoryUtil.getSF().openSession();
        Transaction t = ses.beginTransaction();
        try{
         ses.save(mem);
         t.commit();
        }catch(Exception e ){
            t.rollback();
            e.printStackTrace();
            
        }
    }
    
}
