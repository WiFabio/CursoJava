package com.wifabio.coreengineering.tema08.modelo;

public class Usuario {

	private int idUser;
	private String nomeUsuario;
	private String cpf;
	private int qtdeLivrosEmprestados = 0;

	public Usuario(String nomeUsuario, String cpf) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
	}

	public int getIdUser() {
		return idUser;
	}

	public int setIdUser(int idUser) {
		return this.idUser = idUser;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getQtdeLivrosEmprestados() {
		return qtdeLivrosEmprestados;
	}

	public int setQtdeLivrosEmprestados(int qtdeLivrosEmprestados) {
		return this.qtdeLivrosEmprestados = qtdeLivrosEmprestados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object outroUsuario) {
		if (this == outroUsuario)
			return true;
		if (outroUsuario == null)
			return false;
		if (getClass() != outroUsuario.getClass())
			return false;
		Usuario other = (Usuario) outroUsuario;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n------------\nID: " + this.idUser + "\nUsuário: " + this.nomeUsuario + "\nCPF: " + this.cpf
				+ "\nLivros em empréstimo: " + this.getQtdeLivrosEmprestados() + "\n------------\n";
	}
}
