package galaxy.domain.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import galaxy.domain.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}