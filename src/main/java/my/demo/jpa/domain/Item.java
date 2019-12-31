/**
 * 
 */
package my.demo.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hj.kim khj20825@gmail.com
 * @since 2019. 12. 31.
 *
 */
@Entity
public class Item {
	
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private int price;
	
	
}
