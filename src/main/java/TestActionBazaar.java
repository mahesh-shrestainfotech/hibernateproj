import java.time.LocalDate;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtc.app.entity.Bid;
import com.mtc.app.entity.Item;
import com.mtc.app.util.HibernateUtil;

public class TestActionBazaar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();	
		
//		HashSet<Bid> bids = new HashSet<Bid>();
//		
//		bids.add(new Bid(99901, 240f));
//		bids.add(new Bid(99902, 230f));
//		bids.add(new Bid(99903, 250f));
//		
//		Item item = new Item(1,"iPhoneX", "Apple Mobile", LocalDate.now(), LocalDate.of(2020, 3, 1));
//		
//		item.setBids(bids);
//		
//		
//		Transaction transaction = session.getTransaction();
//		
//		transaction.begin();
//		
//			session.save(item);
//			
//		transaction.commit();
		
		session.close();
		
		sessionFactory.close();


	}

}
