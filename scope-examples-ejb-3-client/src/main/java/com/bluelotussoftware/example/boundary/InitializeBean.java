package com.bluelotussoftware.example.boundary;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.logging.Logger;

@Singleton
@Startup
public class InitializeBean {

    //ok @EJB(lookup="java:global/scope-examples-ejb-3-server/EmailCheckSecurity!com.bluelotussoftware.example.boundary.EmailCheckRemote")
    //ok @EJB(lookup="ejb://scope-examples-ejb-3-server//EmailCheckSecurity!com.bluelotussoftware.example.boundary.EmailCheckRemote")
    @EJB(lookup = "java:global/EmailCheckRemote") //va mappata nello standalone xml in naming sotto binding
    EmailCheckRemote emailCheckRemote;

    @PostConstruct
    public void init(){
        Logger.getLogger(InitializeBean.class.getName()).info("initialize singleton, inject EmailcheckRemote: " + emailCheckRemote);
    }


//    @Timeout
//    @Lock(LockType.WRITE)
//    public void timeout(Timer timer){}

//    @Resource
//    private TimerService timerService;
}
