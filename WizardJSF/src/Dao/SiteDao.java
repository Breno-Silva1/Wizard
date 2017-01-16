package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Site;

public class SiteDao {
	private static final String INSERT_SITE = "INSERT INTO site (nomeDoSite, sloganDoSite, sobreDescricao, contatoDescricao, rodapeLocalizacao, rodapeRedesSociaisF, rodapeRedesSociaisI, rodapeRedesSociaisY, rodapeRedesSociaisT, cep, endereco, cidade, estado, organizador1, organizador2, organizador3, organizador4, organizador5, organizador6, organizador7, organizador8, opcDeCor) VALUES (?, ?, ?, ? ,? ,? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	
	private Connection connection;
	
	public SiteDao(){
		if (this.connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				this.connection = DriverManager.getConnection("jdbc:mysql://localhost/SiteWizard", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fecharConexao() throws SQLException{
		if (this.connection != null) {
			this.connection.close();
		}
	}
	
	public boolean cadastrarSite(Site umSite){
		boolean retorno = false;
		if (this.connection != null) {
			try {
				PreparedStatement stmt = this.connection.prepareStatement(INSERT_SITE);

				stmt.setString(1, umSite.getNomeDoSite());
				stmt.setString(2, umSite.getSloganDoSite());
				stmt.setString(3, umSite.getSobreDescricao());
				stmt.setString(4, umSite.getContatoDescricao());
				stmt.setString(5, umSite.getRodapeLocalizacao());
				stmt.setString(6, umSite.getRodapeRedesSociaisF());
				stmt.setString(7, umSite.getRodapeRedesSociaisI());
				stmt.setString(8, umSite.getRodapeRedesSociaisY());
				stmt.setString(9, umSite.getRodapeRedesSociaisT());
				stmt.setString(10, umSite.getCep());
				stmt.setString(11, umSite.getEndereco());
				stmt.setString(12, umSite.getCidade());
				stmt.setString(13, umSite.getEstado());
				stmt.setString(14, umSite.getOrganizador1());
				stmt.setString(15, umSite.getOrganizador2());
				stmt.setString(16, umSite.getOrganizador3());
				stmt.setString(17, umSite.getOrganizador4());
				stmt.setString(18, umSite.getOrganizador5());
				stmt.setString(19, umSite.getOrganizador6());
				stmt.setString(20, umSite.getOrganizador7());
				stmt.setString(21, umSite.getOrganizador8());
				stmt.setString(22, umSite.getOpcDeCor());

				stmt.executeUpdate();
				stmt.close();
				this.connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return retorno;
	}
}
