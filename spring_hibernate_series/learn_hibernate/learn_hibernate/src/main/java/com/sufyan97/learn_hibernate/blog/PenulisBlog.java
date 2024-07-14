package com.sufyan97.learn_hibernate.blog;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class PenulisBlog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nama;
	
	@ManyToMany
	@JoinTable(
			name = "konten",
			joinColumns = @JoinColumn(name = "id_penulis"),
			inverseJoinColumns = @JoinColumn(name = "id_artikel")
			)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Set<Artikel> artikels = new HashSet<Artikel>();
}
