/*
 * #{copyright}#
 */

package hbi.core.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.demo.dto.Company;
import hbi.core.demo.dto.Customer;
import hbi.core.demo.dto.Form;
import hbi.core.demo.dto.Item;
import hbi.core.demo.service.ICompanyService;


//公司
@Controller
public class CompanyController extends BaseController {

    @Autowired
    private ICompanyService companyService;
    //公司查询
    @RequestMapping(value = "/hbi/company/query")
    @ResponseBody
    public ResponseData getTasks(Company company, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(companyService.selectByCompany(requestContext, company, page, pagesize));
    }
    
    //客户查询
    @RequestMapping(value = "/hbi/customer/query")
    @ResponseBody
    public ResponseData getTasks1(Customer customer, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(companyService.selectByCustomer(requestContext, customer, page, pagesize));
    }
    
    //物料查询
    @RequestMapping(value = "/hbi/item/query")
    @ResponseBody
    public ResponseData getTasks2(Item item, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(companyService.selectByItem(requestContext, item, page, pagesize));
    }
    
    //表单查询
    @RequestMapping(value = "/hbi/form/query")
    @ResponseBody
    public ResponseData getTasks3(Form form, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(companyService.selectByForm(requestContext, form, page, pagesize));
    }
    
    /**
     * 保存水果.
     * 
     * @param fruits
     *            fruits
     * @param result
     *            BindingResult
     * @param request
     *            HttpServletRequest
     * @return ResponseData ResponseData
     * @throws BaseException
     *             BaseException
     */
    
//    @RequestMapping(value = "/ass/fruit/submit", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseData submitFruit(@RequestBody List<Fruit> fruits, BindingResult result, HttpServletRequest request)
//            throws BaseException {
//        getValidator().validate(fruits, result);
//        if (result.hasErrors()) {
//            ResponseData rd = new ResponseData(false);
//            rd.setMessage(getErrorMessage(result, request));
//            return rd;
//        }
//        IRequest requestContext = createRequestContext(request);
//        return new ResponseData(fruitService.batchUpdate(requestContext, fruits));
//    }
//    
//    
//    /**
//     * 批量删除
//     * 
//     */
//    @RequestMapping(value = "/ass/fruit/delete", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseData deleteFruit(@RequestBody List<Fruit> fruits, BindingResult result, HttpServletRequest request)
//            throws BaseException {
//        getValidator().validate(fruits, result);
//        if (result.hasErrors()) {
//            ResponseData rd = new ResponseData(false);
//            rd.setMessage(getErrorMessage(result, request));
//            return rd;
//        }
//        // IRequest requestContext = createRequestContext(request);
//        fruitService.batchDelete(fruits);
//        return new ResponseData();
//    }

}
