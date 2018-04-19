package by.htp.carparking.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SimpleSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("Session was created!!!");
		System.out.println(se.getSource());
		System.out.println(se.getSession().getId());
		System.out.println(se.getSession().getLastAccessedTime());
		se.getSession().setMaxInactiveInterval(1);
		
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionListener.super.sessionDestroyed(se);
	}
	
	
}
