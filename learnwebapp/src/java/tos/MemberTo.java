/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tos;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rishitha
 */
@Entity
public class MemberTo {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memId;
    private String fname;
    private String mname;
    private String lname;
    private String email;
    
    public MemberTo(){
        
    }

    public Long getMemId() {
        return memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
