package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.Company;
import hbi.core.demo.dto.Customer;
import hbi.core.demo.dto.Form;
import hbi.core.demo.dto.Fruit;
import hbi.core.demo.dto.Item;

public interface ICompanyService extends IBaseService<Company>, ProxySelf<Company> {
    //查询公司
	List<Company> selectByCompany(IRequest requestContext, 
    		Company company, int page, int pagesize);
	//查询顾客
    List<Customer> selectByCustomer(IRequest requestContext, 
    		Customer customer, int page, int pagesize);
    //查询物料
    List<Item> selectByItem(IRequest requestContext, 
    		Item item, int page, int pagesize);
    //查询表单
    List<Form> selectByForm(IRequest requestContext, 
    		Form form, int page, int pagesize);
//    List<Fruit> batchUpdate(IRequest requestContext, @StdWho List<Fruit> fruits);

}
