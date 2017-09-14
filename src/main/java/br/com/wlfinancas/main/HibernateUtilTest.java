package br.com.wlfinancas.main;

import org.hibernate.Session;

import br.com.wlfinancas.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		
		sessao.close();
		
	}
}
