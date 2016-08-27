package hbi.core.demo.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name = "hap_om_order_lines")
public class Line extends BaseDTO{
	@Id
	@Column
	private Long lineId;
	@Column
	@NotNull
	private Long headerId;
	@Column
	@NotNull
	private Long lineNumber;
	@Column
	@NotNull
	private Long inventoryItemId;
	@Column
	@NotNull
	private Long orderQua;
	@Column
	@NotEmpty
	private String orderQuaUom;
	@Column
	@NotNull
	private Long unitSellPrice;
	@Column
	@NotEmpty
	private String description;
	@Column
	@NotNull
	private Long companyId;

}
