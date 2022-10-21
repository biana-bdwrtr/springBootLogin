package ltoss.dma.security.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ltoss.dma.security.persistence.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findOneById(String id);
}