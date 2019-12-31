/**
 * 
 */
package my.demo.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hj.kim khj20825@gmail.com
 * @since 2019. 12. 30.
 *
 */
@Entity
@Table(name = "USER")
public class User {
	
	@Id
	private String seq;
	@Column(length = 100, name = "NAME")
	private String name;
	@Column(length = 100, name = "PASSWORD")
	private String password;
	@Column(length = 100, name = "EMAIL")
	private String email;

}
