package webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.model.Classrooms;

@Repository
public interface ClassRepo extends JpaRepository<Classrooms, Long> {

	 //Accounts findbyEmail(String email);

}
