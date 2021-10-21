package tn.esprit.shopping.entities;
	import java.io.Serializable;
	import java.util.Date;
	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.*;


	import com.fasterxml.jackson.annotation.JsonBackReference;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonManagedReference;
	import com.sun.istack.Nullable;

	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
		@Entity
		@Table(	name = "users", 
				uniqueConstraints = { 
					@UniqueConstraint(columnNames = "username"),
					@UniqueConstraint(columnNames = "email") 
				})

public class User implements Serializable {
	
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;

			private String username;

			
			private String email;

			
			private String password;

			@ManyToMany(fetch = FetchType.LAZY)
			@JoinTable(	name = "user_roles", 
						joinColumns = @JoinColumn(name = "user_id"), 
						inverseJoinColumns = @JoinColumn(name = "role_id"))
			private Set<Role> roles = new HashSet<>();

		

			public User(String username, String email, String password) {
				this.username = username;
				this.email = email;
				this.password = password;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Set<Role> getRoles() {
				return roles;
			}

			public void setRoles(Set<Role> roles) {
				this.roles = roles;
			}
	

	@Nullable
	@JsonManagedReference
	@ToString.Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Order> order;

	public Set<Order> getOrder() {
		return order;
	}
	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	public User() {
		super();
	}


}
