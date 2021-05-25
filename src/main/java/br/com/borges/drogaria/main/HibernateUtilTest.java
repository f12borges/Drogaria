package br.com.borges.drogaria.main;

import org.hibernate.Session;

import br.com.borges.drogaria.util.HibernateUtil;

public class HibernateUtilTest {
	
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
