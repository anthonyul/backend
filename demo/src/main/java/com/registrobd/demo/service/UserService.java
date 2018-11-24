package com.registrobd.demo.service;

import java.util.List;

import com.registrobd.demo.model.User;

public interface UserService {

	/**
	 * Guardar un usuario
	 * @param user
	 * @return usuario guardado
	 */
User save(User user);

 /**
  * Recupera lista de usuarios
  * 
  * @return lista d eusuarios
  */
List<User> findAll();
/**
 * Elimina un usuario con el id recibido
 * @param id
 */
void deleteUser(Long id);

}
