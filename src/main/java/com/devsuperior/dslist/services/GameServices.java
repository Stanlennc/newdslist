/**
@${date}
@02:48:42
@${year}
@${file_name}
@${package_name}
@${project_name}
@${autor}
 * 
 */
package com.devsuperior.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.repositories.GameRepository;

/**
 * 
 */
@Service
public class GameServices {
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Games> resultado = gameRepository.findAll();
		List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
	}

}
