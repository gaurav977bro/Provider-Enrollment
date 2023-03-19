package com.java.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.util.SessionFactoryHelper;

@ManagedBean(name = "pDao")
@ViewScoped
public class ProviderDAOImpl implements ProviderDAO {
	
	/*public String verify(String username)
	{
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Provider.class);
		cr.add(Restrictions.eq("username", username));
		Long count = (Long)cr.uniqueResult();
		if(count == 0)
		{
			return username;
		}
		
		
		return null;
	}*/
	
	//AUTO GENERATES PROVIDER'S ID
		 private String generateProviderID(){
		 SessionFactory sfactory = SessionHelper.getConnection();
		 Session session = sfactory.openSession();
		 Criteria criteria = session.createCriteria(Provider.class).setProjection(Projections.max("providerId"));
		 String str = (String) criteria.uniqueResult();
		 if(str==null)
		 {
			 return "P001";
			 
		 }
		 String order = str.substring(1); 
		 int pId = Integer.parseInt(order);
		 pId++; 
		 return String.format("P%03d", pId);
		 }
	 
	@Override
	public String addProvider(Provider provider) {
		
		String ans = EntryptPassword.getCode(provider.getAnswer());
		String ans2 = EntryptPassword.getCode(provider.getAnswer2());
		String pid = generateProviderID();
		provider.setProviderId(pid);
		provider.setAnswer(ans);
		provider.setAnswer2(ans2);
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Provider.class);

		Transaction t = session.beginTransaction();
		session.save(provider);
		t.commit();
		return "Show.xhtml?faces-redirect=true";
	}
	
	/*@Override
	public String addProvider(Provider provider) {
		
		String ans = EntryptPassword.getCode(provider.getAnswer());
		String pid = generateProviderID();
		provider.setProviderId(pid);
		provider.setAnswer(ans);
		provider.set
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Provider.class);

		Transaction t = session.beginTransaction();
		session.save(provider);
		t.commit();
		return "Show.xhtml?faces-redirect=true";
	}*/

	@Override
	public List<Provider> showProvider() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Provider.class);
		List<Provider> pList = cr.list();
		return pList;
	}

}
