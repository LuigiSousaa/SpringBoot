package webapp.newsletterjdbc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webapp.newsletterjdbc.Connection.IndexDAO;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView abrirIndex() {
        ModelAndView mv = new ModelAndView("cadastro");

        new IndexDAO().criaTabela();
        String mensagem = "Olá, seja bem-vinda(o)!";
        mv.addObject("msg", mensagem);

        return mv;
    }

    @RequestMapping(value = "/", method=RequestMethod.POST)
    public ModelAndView enviaEmail(@RequestParam("email") String email, @RequestParam("password") String password) {
        ModelAndView mv = new ModelAndView("cadastro");
        new IndexDAO().cadastrar(email, password);
        return mv;
    }
    
}
