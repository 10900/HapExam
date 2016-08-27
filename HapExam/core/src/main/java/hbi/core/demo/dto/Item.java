package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;


@Table(name = "hap_inv_inventory_items")
public class Item extends BaseDTO{
	@Id
	@Column
	@GeneratedValue
	private Long inventoryItemId;
	@Column
	@NotEmpty
	private String itemCode;
	@Column
	@NotEmpty
	private String itemUom;
	@Column
	@NotEmpty
	private String itemDescription;
	@Column
	@NotEmpty
	private String oredrFlag;
	@Column
	private Date startActiveDate;
	@Column
	private Date endActiveDate;
	@Column
	@NotEmpty
	private String enabledFlag;
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
	
	public Long getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemUom() {
		return itemUom;
	}
	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getOredrFlag() {
		return oredrFlag;
	}
	public void setOredrFlag(String oredrFlag) {
		this.oredrFlag = oredrFlag;
	}
	public Date getStartActiveDate() {
		return startActiveDate;
	}
	public void setStartActiveDate(Date startActiveDate) {
		this.startActiveDate = startActiveDate;
	}
	public Date getEndActiveDate() {
		return endActiveDate;
	}
	public void setEndActiveDate(Date endActiveDate) {
		this.endActiveDate = endActiveDate;
	}
	public String getEnabledFlag() {
		return enabledFlag;
	}
	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(Long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}
	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
	
	
	
	
	
}
