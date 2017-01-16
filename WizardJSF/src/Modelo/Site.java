package Modelo;

public class Site {
	private int id;
	private String nomeDoSite;
	private String sloganDoSite;
	private String sobreDescricao;
	private String contatoDescricao;
	private String rodapeLocalizacao;
	private String redesSociaisF;
	private String redesSociaisI;
	private String redesSociaisY;
	private String redesSociaisT;
	private String opcDeCor;
	private String cep;
	private String endereco;
	private String cidade;
	private String estado;
	private String organizador1, organizador2, organizador3, organizador4, organizador5, organizador6, organizador7, organizador8;
	
	public Site() {
		super();
	}
	
	public Site(int id, String nomeDoSite, String sloganDoSite, String sobreDescricao, String contatoDescricao,
		String rodapeLocalizacao, String redesSociaisF, String redesSociaisI, String redesSociaisY,
		String redesSociaisT, String opcDeCor, String cep, String endereco, String cidade, String estado,
		String organizador1, String organizador2, String organizador3, String organizador4, String organizador5,
		String organizador6, String organizador7, String organizador8) {
		super();
		this.id = id;
		this.nomeDoSite = nomeDoSite;
		this.sloganDoSite = sloganDoSite;
		this.sobreDescricao = sobreDescricao;
		this.contatoDescricao = contatoDescricao;
		this.rodapeLocalizacao = rodapeLocalizacao;
		this.redesSociaisF = redesSociaisF;
		this.redesSociaisI = redesSociaisI;
		this.redesSociaisY = redesSociaisY;
		this.redesSociaisT = redesSociaisT;
		this.opcDeCor = opcDeCor;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.organizador1 = organizador1;
		this.organizador2 = organizador2;
		this.organizador3 = organizador3;
		this.organizador4 = organizador4;
		this.organizador5 = organizador5;
		this.organizador6 = organizador6;
		this.organizador7 = organizador7;
		this.organizador8 = organizador8;
	}

	public Site(String nomeDoSite, String sloganDoSite, String sobreDescricao, String contatoDescricao,
		String rodapeLocalizacao, String redesSociaisF, String redesSociaisI, String redesSociaisY,
		String redesSociaisT, String opcDeCor, String cep, String endereco, String cidade, String estado,
		String organizador1, String organizador2, String organizador3, String organizador4, String organizador5,
		String organizador6, String organizador7, String organizador8) {
		super();
		this.nomeDoSite = nomeDoSite;
		this.sloganDoSite = sloganDoSite;
		this.sobreDescricao = sobreDescricao;
		this.contatoDescricao = contatoDescricao;
		this.rodapeLocalizacao = rodapeLocalizacao;
		this.redesSociaisF = redesSociaisF;
		this.redesSociaisI = redesSociaisI;
		this.redesSociaisY = redesSociaisY;
		this.redesSociaisT = redesSociaisT;
		this.opcDeCor = opcDeCor;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.organizador1 = organizador1;
		this.organizador2 = organizador2;
		this.organizador3 = organizador3;
		this.organizador4 = organizador4;
		this.organizador5 = organizador5;
		this.organizador6 = organizador6;
		this.organizador7 = organizador7;
		this.organizador8 = organizador8;
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoSite() {
		return nomeDoSite;
	}

	public void setNomeDoSite(String nomeDoSite) {
		this.nomeDoSite = nomeDoSite;
	}

	public String getSloganDoSite() {
		return sloganDoSite;
	}

	public void setSloganDoSite(String sloganDoSite) {
		this.sloganDoSite = sloganDoSite;
	}

	public String getSobreDescricao() {
		return sobreDescricao;
	}

	public void setSobreDescricao(String servicoDescricao) {
		this.sobreDescricao = servicoDescricao;
	}

	public String getContatoDescricao() {
		return contatoDescricao;
	}

	public void setContatoDescricao(String contatoDescricao) {
		this.contatoDescricao = contatoDescricao;
	}

	public String getRodapeLocalizacao() {
		return rodapeLocalizacao;
	}

	public void setRodapeLocalizacao(String rodapeLocalizacao) {
		this.rodapeLocalizacao = rodapeLocalizacao;
	}

	public String getRodapeRedesSociaisF() {
		return redesSociaisF;
	}

	public void setRodapeRedesSociaisF(String rodapeRedesSociaisF) {
		this.redesSociaisF = rodapeRedesSociaisF;
	}

	public String getRodapeRedesSociaisI() {
		return redesSociaisI;
	}

	public void setRodapeRedesSociaisI(String rodapeRedesSociaisI) {
		this.redesSociaisI = rodapeRedesSociaisI;
	}

	public String getRodapeRedesSociaisY() {
		return redesSociaisY;
	}

	public void setRodapeRedesSociaisY(String rodapeRedesSociaisY) {
		this.redesSociaisY = rodapeRedesSociaisY;
	}

	public String getRodapeRedesSociaisT() {
		return redesSociaisT;
	}

	public void setRodapeRedesSociaisT(String rodapeRedesSociaisT) {
		this.redesSociaisT = rodapeRedesSociaisT;
	}

	public String getOpcDeCor() {
		return opcDeCor;
	}

	public void setOpcDeCor(String opcDeCor) {
		this.opcDeCor = opcDeCor;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getOrganizador1() {
		return organizador1;
	}

	public void setOrganizador1(String organizador1) {
		this.organizador1 = organizador1;
	}

	public String getOrganizador2() {
		return organizador2;
	}

	public void setOrganizador2(String organizador2) {
		this.organizador2 = organizador2;
	}

	public String getOrganizador3() {
		return organizador3;
	}

	public void setOrganizador3(String organizador3) {
		this.organizador3 = organizador3;
	}

	public String getOrganizador4() {
		return organizador4;
	}

	public void setOrganizador4(String organizador4) {
		this.organizador4 = organizador4;
	}

	public String getOrganizador5() {
		return organizador5;
	}

	public void setOrganizador5(String organizador5) {
		this.organizador5 = organizador5;
	}

	public String getOrganizador6() {
		return organizador6;
	}

	public void setOrganizador6(String organizador6) {
		this.organizador6 = organizador6;
	}

	public String getOrganizador7() {
		return organizador7;
	}

	public void setOrganizador7(String organizador7) {
		this.organizador7 = organizador7;
	}

	public String getOrganizador8() {
		return organizador8;
	}

	public void setOrganizador8(String organizador8) {
		this.organizador8 = organizador8;
	}
}

