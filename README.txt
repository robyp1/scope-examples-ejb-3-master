installare due wildfly 10

nel secondo deploiare il modulo ejb (jar)
nel primo il client war (che chiamerà l'ejb remoto)

per farlo esitare standalone.xml e aggiungere il bindings\lookup nel tag naming:

<subsystem xmlns="urn:jboss:domain:naming:2.0">

<bindings>
                
<lookup name="java:global/EmailCheckRemote" 
lookup="ejb://scope-examples-ejb-3-server//EmailCheckSecurity!com.bluelotussoftware.example.boundary.EmailCheckRemote"/>

</bindings>

<remote-naming/>

</subsystem>

ho usato poi
@EJB(lookup="java:global/EmailCheckRemote")
per reperirlo in modo che il jndi è inventato e può essere mappato in qualsiasi app server
tramite file di configurazione