package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_om_order_headers")
public class Header extends BaseDTO{
	@Id
	@Column
	private Long headerId;
	@Column
	@NotEmpty
	private String orderNumber;
	@Column
	@NotNull
	private Long companyId;
	
	@Column
	@NotNull	//date类型非空怎么验证？？？？？
	private Date orderDate;
	
	@Column
	@NotEmpty
	private String orderStatus;
	@Column
	@NotNull
	private Long customerId;
	@Column
	private Double objVersionNumber;
	@Column
	private Long requestId;
	@Column
	private Long programId;
	@Column
	private Date creationDate;
	@Column
	private Long createdBy;
	@Column
	private Long lastUpdateBy;
	@Column
	private Date lastUpdateDate;
	@Column
	private Long lastUpdateLogin;
	

}
