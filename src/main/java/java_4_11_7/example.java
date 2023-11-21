package java_4_11_7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface example extends JpaRepository<User, Long> {

    @Query(
            value = "SELECT * FROM USERS u WHERE u.id = 1",
            nativeQuery = true)
    Collection<User> findAllActiveUsersNative();

}
