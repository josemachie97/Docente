package com.example.Docentes.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.Docentes.DAO.UsuarioDAO;
import com.example.Docentes.Model.UsuarioModel;

public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	 private UsuarioDAO userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 UsuarioModel usuario= userRepo.findbyUsername(username);
		 if(usuario==null) {
			 throw new UsernameNotFoundException("Usuario não Achado");
		 }
		 
		return new CustomUserDetail(usuario);
	}

}
