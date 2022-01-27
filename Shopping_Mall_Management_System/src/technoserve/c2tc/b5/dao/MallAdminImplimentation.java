/*package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.MallAdmin;

public class MallAdminImplimentation implements MallAdminDao {
EntityManager em;
	
	

	public MallAdminImplimentation() {
		em=Configuration.createEntityManager();
		
	}

	@Override
	public void addMallAdmin(MallAdmin malladmin) {
		em.persist( malladmin );
		
	}

	@Override
	public void updateMallAdmin(MallAdmin malladmin) {
		em.merge(malladmin);
		
	}

	@Override
	public void deleteMallAdmin(long id) {
		MallAdmin malladmin=SearchMallAdmin(id);
	      em.remove(malladmin);
		
	}

	@Override
	public MallAdmin SearchMallAdmin(long id) {
		MallAdmin malladmin=em.find(MallAdmin.class,id);
		return malladmin;
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
*/