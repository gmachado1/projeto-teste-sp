package br.com.spring_mvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sun.tracing.dtrace.Attributes;

import br.com.spring_mvc.dao.UsuarioDao;
import br.com.spring_mvc.domain.Usuario;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="/todos", method=RequestMethod.GET)
	public ModelAndView listaTodos(ModelMap model) {
		model.addAttribute("usuarios",usuarioDao.getTodos());
		return new ModelAndView("/user/list",model);
	}
	
	@GetMapping("cadastro")
	public String cadastrar(@ModelAttribute("usuario") Usuario usuario, ModelMap map) {
		return "/user/add";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("usuario")Usuario usuario,RedirectAttributes attr) {
		
		usuarioDao.salvar(usuario);
		attr.addFlashAttribute("messagem","Usuário salvo com sucesso!!");
		return "redirect:/usuario/todos";
	}
}
