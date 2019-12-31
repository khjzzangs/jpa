/**
 * 
 */
package my.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.demo.jpa.domain.User;

/**
 * @author hj.kim khj20825@gmail.com
 * @since 2019. 12. 30.
 *
 */
public interface UserRepository extends JpaRepository<User, String>{

}
