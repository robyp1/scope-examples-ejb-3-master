package com.bluelotussoftware.example.boundary;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.regex.Pattern;

@Stateless
@Remote(EmailCheckRemote.class)
public class EmailCheckSecurity implements EmailCheckRemote{

    public EmailCheckSecurity() {
    }


    public Boolean checkMailInSecurity(String mail){
        Pattern compile = Pattern.compile("(\\w)+(@){1}(\\w)+(\\.)(\\w)+");
        return mail.matches(compile.pattern());
    }
}

