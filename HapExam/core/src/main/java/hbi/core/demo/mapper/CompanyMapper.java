package hbi.core.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Company;
import hbi.core.demo.dto.Customer;
import hbi.core.demo.dto.Form;
import hbi.core.demo.dto.Fruit;
import hbi.core.demo.dto.Item;

public interface CompanyMapper extends Mapper<Company>{
	
	List<Company> selectByCompany(Company company);
	
	List<Customer> selectByCustomer(Customer customer);
	
	List<Item> selectByItem(Item item);

	List<Form> selectByForm(Form form);
//	int insertFruit(Fruit fruit);
//	
//	int updateFruit(Fruit fruit);
//	
//	int deleteFruit(Fruit fruit);


}
