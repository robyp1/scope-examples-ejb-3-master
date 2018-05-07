package com.bluelotussoftware.example.boundary;

//questa dovrebbe essere quella del server e deve stare in un modulo esterno incluso
//sia nel server che nel client
public interface EmailCheckRemote {

    public Boolean checkMailInSecurity(String mail);
}

