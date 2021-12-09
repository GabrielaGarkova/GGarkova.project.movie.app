package uni.fmi.GGarkova.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uni.fmi.GGarkova.project.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	UserEntity findByUsername(String username);
	
	UserEntity findUserByUsernameAndPassword(String username, String password);
		
	List<UserEntity> findByUsernameContainingAndIdNot (String username, int id);

}
