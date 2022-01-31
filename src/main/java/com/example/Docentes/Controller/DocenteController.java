package com.example.Docentes.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Docentes.DAO.DocenteDAO;
import com.example.Docentes.Model.DocenteModel;

@Controller
public class DocenteController {
	
	@Autowired
	private DocenteDAO docenteRepo;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("docente/index");
		return mv;
	}
	
	@GetMapping("/cadastrarDocente")
	public ModelAndView cadastro( DocenteModel docente) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("Docente", docente);
		mv.setViewName("docente/cadastroDocente");
		return mv;
	}
	
	@PostMapping("/processoCadastroDocente")
	public ModelAndView processoCadastro( DocenteModel docente) {
		ModelAndView mv = new ModelAndView();
		//mv.addObject("Docente", docente);
		docenteRepo.save(docente);
		mv.setViewName("redirect:listarDocente");
		return mv;
	}
		
	
	@GetMapping("/listarDocente")
	public ModelAndView listarDocente() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("docente/listarDocente");
		mv.addObject("listaDocentes", docenteRepo.findAll());
		return mv;
	}
	
	@GetMapping("/Editar/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		ModelAndView mv= new ModelAndView();
		DocenteModel docente= docenteRepo.getById(id);
		mv.addObject("Docente", docente);		
		mv.setViewName("docente/actualizarDocente");
		return mv;	
	}
	
	@PostMapping("/Editar")
	public ModelAndView editarProcesso(@Valid DocenteModel docente) {
		ModelAndView mv= new ModelAndView();
		docenteRepo.save(docente);
		mv.setViewName("redirect:/listarDocente");
		return mv;
	}
	
	@GetMapping("/Excluir/{id}")
	public ModelAndView excluir(@PathVariable("id") Long id) {
		ModelAndView mv= new ModelAndView();
		docenteRepo.deleteById(id);
		mv.setViewName("redirect:/listarDocente");
		return mv;
	}
	
	
	
	

}
