package fr.koor.webstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.koor.webstore.business.Article;

public class Console {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
            entityManager = entityManagerFactory.createEntityManager();
            
            Article art = entityManager.find(Article.class, 4);
            System.out.println( art );

        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }
}