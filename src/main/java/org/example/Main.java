package org.example;

import bean.Admin;
import bean.HE;
import bean.SE;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg=cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tx= ses.beginTransaction();
        SE s1=new SE(101,"shubham","shubham@gmail.com",50000,"hibernate");
        HE h1=new HE(102,"shubham","shubham@gmial.com",50000,8);
        Admin a1=new Admin(103,"shubham","shubham@gmail.com",50000,"sales");
        ses.save(s1);
        ses.save(h1);
        ses.save(a1);
        tx.commit();

    }
}