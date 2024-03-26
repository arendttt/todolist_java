package br.com.milenarendt.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // adicionando os getters e setters
@Entity(name = "tb_users") // definindo que a classe é a estrutura do banco de dados
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID") // para o id ser gerado automaticamente
  private UUID id; // chave primaria do bd

  @Column(unique = true) // validação para que o username não possa ter valores repetidos
  private String username;
  private String name;
  private String password;

  @CreationTimestamp // data de criação automática
  private LocalDateTime createdAt;
 
}
