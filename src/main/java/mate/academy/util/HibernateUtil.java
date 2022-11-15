package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory initSessionFactory() {
        return instance;
    }
}