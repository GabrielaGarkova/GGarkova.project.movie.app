package uni.fmi.GGarkova.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uni.fmi.GGarkova.project.entities.NotificationEntity;
import uni.fmi.GGarkova.project.entities.UserEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, Integer>{

	List<NotificationEntity> findByToUser(UserEntity user);
}
