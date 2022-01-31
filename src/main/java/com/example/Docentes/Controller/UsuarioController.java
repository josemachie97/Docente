package com.example.Docentes.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Docentes.DAO.UsuarioDAO;
import com.example.Docentes.Model.UsuarioModel;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO userRepo;
	
	
	
	@GetMapping("/registrarUser")
	public ModelAndView registrarUser(UsuarioModel usuario) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("Usuario", usuario);
		mv.setViewName("login/registrar");
		return mv;
}
	
	 @PostMapping("/processoCadastroUsuario")
	 public ModelAndView processoCadastroUsuario(UsuarioModel usuario) {
		 ModelAndView mv= new ModelAndView();
		 BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
		String encodePassword;
		encodePassword = passwordEncoder.encode(usuario.getPassword());
		usuario.setPassword(encodePassword);
		 
		userRepo.save(usuario);
		mv.setViewName("redirect:/login");
		 return mv;
	 }
	 
	
	 @GetMapping("/login")
		public ModelAndView cadastrarUser(UsuarioModel usuario) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("Usuario", usuario);
			mv.setViewName("login/login");
			return mv;
	}
	 
	 @PostMapping("/login")
		public ModelAndView LoginUser( UsuarioModel usuario) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("redirect:/");
			return mv;
	}
	 
	

}