package com.example.detaithuctap.Entity.User;

import com.example.detaithuctap.Entity.MonAn.NhanXetMonAn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "user")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "tendaidien")
    private String tendaidien;
    @Column(name = "anhdaidien")
    private String anhdaidien;
    @Column(name = "quyen")
    private String quyen;

    public NguoiDung(String username, String password, String tendaidien, String anhdaidien, String quyen,
			List<NhanXetMonAn> nhanXetMonAns) {
		super();
		this.username = username;
		this.password = password;
		this.tendaidien = tendaidien;
		this.anhdaidien = anhdaidien;
		this.quyen = quyen;
		this.nhanXetMonAns = nhanXetMonAns;
	}
    

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTendaidien() {
		return tendaidien;
	}


	public void setTendaidien(String tendaidien) {
		this.tendaidien = tendaidien;
	}


	public String getAnhdaidien() {
		return anhdaidien;
	}


	public void setAnhdaidien(String anhdaidien) {
		this.anhdaidien = anhdaidien;
	}


	public String getQuyen() {
		return quyen;
	}


	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}


	public List<NhanXetMonAn> getNhanXetMonAns() {
		return nhanXetMonAns;
	}


	public void setNhanXetMonAns(List<NhanXetMonAn> nhanXetMonAns) {
		this.nhanXetMonAns = nhanXetMonAns;
	}




	public NguoiDung() {
		super();
	}


	@OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<NhanXetMonAn> nhanXetMonAns;

}
