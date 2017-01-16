package ManagedBean;

import java.sql.SQLException;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

import Dao.SiteDao;
import Modelo.Site;

@ManagedBean
@SessionScoped
public class Mbean {
	private String nomeDoSite;
	private String sloganDoSite;
	private String sobreDescricao;
	private String contatoDescricao;
	private String rodapeLocalizacao;
	private String redesSociaisF = null;
	private String redesSociaisI = null;
	private String redesSociaisY = null;
	private String redesSociaisT = null;
	private String cep;
	private String endereco;
	private String cidade;
	private String estado;
	private String organizador1, organizador2, organizador3, organizador4, organizador5, organizador6, organizador7, organizador8;
	
	
	private String opcDeCor;
	private Part imagem; 
	Calendar cal = Calendar.getInstance();
	private int ano = cal.get(Calendar.YEAR);
	
	public String montarSite() throws SQLException {
		if (nomeDoSite != null && sobreDescricao != null && cep != null && endereco != null && cidade != null && estado != null) {
			Site site = new Site(nomeDoSite, sloganDoSite, sobreDescricao, contatoDescricao, rodapeLocalizacao, redesSociaisF, redesSociaisI, redesSociaisY, redesSociaisT, opcDeCor, cep, endereco, cidade, estado, organizador1, organizador2, organizador3, organizador4, organizador5, organizador6, organizador7, organizador8);
			dao.cadastrarSite(site);
			dao.fecharConexao();
			return "TemplateWizard";
		}
		return "ErroWizard";
	}
	
	public String corSelecionada(){
		if (opcDeCor != null) {
			if (opcDeCor.equals("Azul")) {
				return "#2196F3";
			}
			if (opcDeCor.equals("Verde")) {
				return "#18bc9c";
			}
			if (opcDeCor.equals("Laranja")) {
				return "#ca5b39";
			}
			if (opcDeCor.equals("Rosa")) {
				return "#ce2b62";
			}
			if (opcDeCor.equals("Roxo")) {
				return "#673AB7";
			}
			if (opcDeCor.equals("Amarelo")) {
				return "#FFC107";
			}
		}
		return "#18bc9c";
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


	SiteDao dao = new SiteDao();
	
	public void upload(){
		
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
	public void setSobreDescricao(String sobreDescricao) {
		this.sobreDescricao = sobreDescricao;
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

	public Part getImagem() {
		return imagem;
	}

	public void setImagem(Part imagem) {
		this.imagem = imagem;
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
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
