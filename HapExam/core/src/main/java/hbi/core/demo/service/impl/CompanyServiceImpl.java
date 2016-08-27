package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Company;
import hbi.core.demo.dto.Customer;
import hbi.core.demo.dto.Form;
import hbi.core.demo.dto.Fruit;
import hbi.core.demo.dto.Item;
import hbi.core.demo.mapper.CompanyMapper;
import hbi.core.demo.service.ICompanyService;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    //查询公司
	public List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return companyMapper.selectByCompany(company);
	}
	//查询顾客
    public List<Customer> selectByCustomer(IRequest requestContext, 
    		Customer customer, int page, int pagesize){
    	PageHelper.startPage(page, pagesize);
		return companyMapper.selectByCustomer(customer);
    	
    }
    //查询物料
    public List<Item> selectByItem(IRequest requestContext, 
    		Item item, int page, int pagesize){
    	PageHelper.startPage(page, pagesize);
		return companyMapper.selectByItem(item);
    	
    }
    //查询表单
    public List<Form> selectByForm(IRequest requestContext, 
    		Form form, int page, int pagesize){
    	PageHelper.startPage(page, pagesize);
		return companyMapper.selectByForm(form);
    	
    }
	
//
//	@Override
//	@Transactional(propagation = Propagation.SUPPORTS)
//    public List<Fruit> batchUpdate(IRequest requestContext, List<Fruit> fruits) {
//        // TODO Auto-generated method stub
//        for (Fruit fruit : fruits) {
//            if (fruit.get__status() != null) {
//                switch (fruit.get__status()) {
//                case DTOStatus.ADD:
//                	fruitMapper.insertSelective(fruit);
//                    break;
//                case DTOStatus.UPDATE:
//                	//fruitMapper.updateFruit(fruit);
//                	self().updateByPrimaryKey(requestContext, fruit);
//                    break;
//                case DTOStatus.DELETE:
//                    self().deleteByPrimaryKey(fruit);
//
//                    break;
//                default:
//                    break;
//                }
//            }
//        }
//        return fruits;
//	}
	
	

}
