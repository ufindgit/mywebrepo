/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jldaos;

import form.RegistrationForm;
import tos.MemberTo;

/**
 *
 * @author Rishitha
 */
public interface MemberDAOI {
    
     void registerMember(MemberTo mem);
     boolean isExisting(String email );
    
}
