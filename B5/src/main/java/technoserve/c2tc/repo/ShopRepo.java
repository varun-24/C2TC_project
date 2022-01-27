package technoserve.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import technoserve.c2tc.entities.Shop;
import technoserve.c2tc.entities.Student;

public interface ShopRepo extends JpaRepository<Student, Integer> {

	void save(Shop s);





	

}
