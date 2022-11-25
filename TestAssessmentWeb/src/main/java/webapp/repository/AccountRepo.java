package webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.model.Accounts;

@Repository
public interface AccountRepo extends JpaRepository<Accounts, String> {

	 //Accounts findbyEmail(String Email);


}
