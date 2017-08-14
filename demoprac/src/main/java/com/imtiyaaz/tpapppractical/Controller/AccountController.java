package com.imtiyaaz.tpapppractical.Controller;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/home")
public class AccountController {

 /*   @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private OperationsRepository operationRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/{id}/view_account", method = RequestMethod.GET)
    public String viewAccount(@PathVariable long id, Model model){
        Account account = accountRepository.findOne(id);
        model.addAttribute("account",account);
        return "/view_account";
    }

    @RequestMapping(value = "home/add_account", method = RequestMethod.POST)
    public String addNewAccount(HttpServletRequest request){
        List<Account> accountList = accountRepository.findAll();
        Account account = new Account(request.getParameter("accountType"), Float.parseFloat(request.getParameter("accBalance")), new Date());
        AccountValidation validation = new AccountValidation();

        Client client = clientRepository.findBycCnp(request.getParameter("clientCnp"));

        if (client != null) {
            account.setClient(client);
            if (!accountList.contains(account) && validation.validateAccount(account)) {
                accountRepository.save(account);
            }
            else
                return "redirect:/errorpage";
        }
        else
            return "redirect:/errorpage";

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = userRepository.findByEmployeeUsername(username);
        Operations operation = new Operations(new Date(),"Added account "+ account.getAccountNumber(),client,user);
        operationRepository.save(operation);

        return "redirect:/home";
    }

    @RequestMapping(value = "/update_account", method = RequestMethod.GET)
    public String showUpdate(){return "/update_account";}

    @RequestMapping(value = "/{id}/update_account", method = RequestMethod.GET)
    public String viewUpdate(@PathVariable long id, Model model){
        Account account = accountRepository.findOne(id);
        model.addAttribute("account",account);
        return "/home/update_account";
    }
    @RequestMapping(value = "updateaccount", method = RequestMethod.POST)
    public String updateAccount(HttpServletRequest request){
        Account account = accountRepository.findOne(Long.parseLong(request.getParameter("search")));

        if(account != null) {
            account.setAccountType(request.getParameter("accountType"));
            account.setAccBalance(Float.parseFloat(request.getParameter("accountBalance")));

            accountRepository.save(account);
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            User user = userRepository.findByEmployeeUsername(username);
            Operations operations = new Operations(new Date(),"Account with ID: " +account.getAccountNumber()+ " was updated.", account.getClient(),user);
            OperationsRepository.save(operations);

            return "redirect:/home";
        }
        else
            return "redirect:/errorpage";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteAccount(@PathVariable long id) {
        Account account = accountRepository.findOne(id);

        if(account != null){
            accountRepository.delete(id);
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            User user = userRepository.findByEmployeeUsername(username);
            Operations operation = new Operations(new Date(),"Account with ID: "+id+" was deleted.", account.getClient(),user);
            OperationsRepository.save(operation);
            return "redirect:/home";
        }
        else
            return "redirect:/errorpage";
    }


}
*/
}