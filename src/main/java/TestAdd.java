import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;
import com.mtc.app.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		Product product = new Product();
		
		product.setName("Vivo V11");
		product.setPrice(300F);
		product.setQuantity(33);
		product.setDescription("Vivo Phone");
		
		Supplier supplier = new Supplier();
		
		supplier.setId(99904);
		supplier.setName("Vivo");
		
		product.setSupplier(supplier);
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(product);
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();

	}

}
