package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

public class MallDaoImplementation implements MallDao {
EntityManager em;
	
	

	public MallDaoImplementation() {
		em=Configuration.createEntityManager();
		
	}

	@Override
	public void addMall(MallDao malldao) {
		em.persist( malldao );
		
	}

	@Override
	public void updateMall(MallDao malldao) {
		em.merge(malldao);
		
	}
	@Override
	public MallDao SearchMall(long id) {
		MallDao malldao=em.find(MallDao.class,id);
		return malldao;
	}

	@Override
	public void startTranscaion() {
		em.getTransaction().begin();
	}

	@Override
	public void EndTranscaion() {
		em.getTransaction().commit();
		
	}
}


