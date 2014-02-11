/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jlactions;

import form.RegistrationForm;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jldaos.MemberHibDAO;
import jldaos.MemberDAOI;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import tos.MemberTo;

/**
 *
 * @author Rishitha
 */
public class RegisterAction extends DispatchAction{
    
    public ActionForward registerMember(ActionMapping mp,ActionForm form,
            HttpServletRequest req,HttpServletResponse res ){
        
         RegistrationForm reg = (RegistrationForm)form;
         MemberDAOI dao = new MemberHibDAO();
         MemberTo mem = new MemberTo();
         mem.setEmail(reg.getEmail());
         mem.setFname(reg.getFname());
         mem.setLname(reg.getLname());
         mem.setMname(reg.getMname());
         mem.setPassword(reg.getPassword());
         dao.registerMember(mem);
         return mp.findForward("regSuccess");
        
    }
    public ActionForward checkEmail(ActionMapping mp,ActionForm form,
            HttpServletRequest req,HttpServletResponse res ) throws IOException{
        RegistrationForm reg = (RegistrationForm)form;
        MemberDAOI dao = new MemberHibDAO();
        if(dao.isExisting(reg.getEmail())){
            res.getOutputStream().print("existing");
         }else{
            res.getOutputStream().print("notexisting");
        }
        
        
        return null;
        
    }
    
}
