import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Product product = session.get(Product.class,2);
		
		Supplier supplier = product.getSupplier();
		
		
		
		System.out.println(product);
		
		System.out.println(supplier);
		
		session.close();
		
		sessionFactory.close();

	}

}
