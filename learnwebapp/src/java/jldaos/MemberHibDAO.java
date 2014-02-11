/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jldaos;

import form.RegistrationForm;
import jldaos.MemberDAOI;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
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

    public boolean isExisting(String email) {
         
        Session ses = SessionFactoryUtil.getSF().openSession();
       
         Criteria cri = ses.createCriteria(MemberTo.class);
         cri.add(Expression.eq("email", email));
         MemberTo mem =(MemberTo)cri.uniqueResult();
         if(mem != null ){
             return true;
         }else{
             return false;
         }
        
    
    }
    
}
