package pl.javastart.dao;

import pl.javastart.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDaoImpl implements BookDao {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;


    public BookDaoImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void save(Book book) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(book);
        tx.commit();

    }

    public Book get(Long id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }

    public void cleanUp() {
        entityManager.close();
        entityManagerFactory.close();

    }
}
