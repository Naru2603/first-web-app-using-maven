package com.basic.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }
    }
    
    public static void loadSessionFactory(){
    	 
        Configuration configuration = new Configuration();
        
        configuration.configure();
//        configuration.addAnnotatedClass(Employee.class);
//        configuration.addAnnotatedClass(AssetMgnt.class);
//        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        sessionFactory = configuration.buildSessionFactory(srvcReg);
        
        sessionFactory = configuration.buildSessionFactory();
    }
	
    public static Session getSession() throws HibernateException {
    	 
        Session getSession=null;
            try {
                getSession = sessionFactory.openSession();
            }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
            }
            if(getSession == null) {
                System.err.println("session is discovered null");
            }
 
            return getSession;
}
}
