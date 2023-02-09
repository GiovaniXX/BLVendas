package DAO;

import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.ModelClientes;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class DaoClientes extends ConexaoMySql {

    /**
     * Grava Cliente
     *
     * @param pModelCliente
     * @return int
     */
    public int salvarClienteDAO(ModelClientes pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_cliente ("
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + ") VALUES ("
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliUf() + "',"
                    + "'" + pModelCliente.getCliCep() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Recupera Cliente
     *
     * @param pIdCliente
     * @return modelCliente
     */
    public ModelClientes getClienteDAO(int pIdCliente) {
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM "
                    + " tbl_cliente"
                    + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelClientes.setIdCliente(this.getResultSet().getInt(1));
                modelClientes.setCliNome(this.getResultSet().getString(2));
                modelClientes.setCliEndereco(this.getResultSet().getString(3));
                modelClientes.setCliBairro(this.getResultSet().getString(4));
                modelClientes.setCliCidade(this.getResultSet().getString(5));
                modelClientes.setCliUf(this.getResultSet().getString(6));
                modelClientes.setCliCep(this.getResultSet().getString(7));
                modelClientes.setCliTelefone(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelClientes;
    }

    /**
     * Recupera Cliente
     *
     * @param pNomeCliente
     * @return ModelCliente
     */
    public ModelClientes getClienteDAO(String pNomeCliente) {
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM"
                    + " tbl_cliente"
                    + " WHERE"
                    + " cli_nome = '" + pNomeCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelClientes.setIdCliente(this.getResultSet().getInt(1));
                modelClientes.setCliNome(this.getResultSet().getString(2));
                modelClientes.setCliEndereco(this.getResultSet().getString(3));
                modelClientes.setCliBairro(this.getResultSet().getString(4));
                modelClientes.setCliCidade(this.getResultSet().getString(5));
                modelClientes.setCliUf(this.getResultSet().getString(6));
                modelClientes.setCliCep(this.getResultSet().getString(7));
                modelClientes.setCliTelefone(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelClientes;
    }

    /**
     * Recupera uma lista de cliente
     *
     * @return ArrayList
     */
    public ArrayList<ModelClientes> getListaClienteDAO() {
        ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                    + " FROM "
                    + "tbl_cliente"
            );
            while (this.getResultSet().next()) {
                modelClientes = new ModelClientes();
                modelClientes.setIdCliente(this.getResultSet().getInt(1));
                modelClientes.setCliNome(this.getResultSet().getString(2));
                modelClientes.setCliEndereco(this.getResultSet().getString(3));
                modelClientes.setCliBairro(this.getResultSet().getString(4));
                modelClientes.setCliCidade(this.getResultSet().getString(5));
                modelClientes.setCliUf(this.getResultSet().getString(6));
                modelClientes.setCliCep(this.getResultSet().getString(7));
                modelClientes.setCliTelefone(this.getResultSet().getString(8));
                listaModelClientes.add(modelClientes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelClientes;
    }

    /**
     * Atualiza Cliente
     *
     * @param pModelCliente
     * @return boolean
     */
    public boolean atualizarClienteDAO(ModelClientes pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli_nome = '" + pModelCliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelCliente.getCliUf() + "',"
                    + "cli_cep = '" + pModelCliente.getCliCep() + "',"
                    + "cli_telefone = '" + pModelCliente.getCliTelefone() + "'"
                    + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Exclui Cliente
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteDAO(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente "
                    + "WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean gerarRelatorioCliente() {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
                    + "tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
                    + "tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
                    + "tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
                    + "tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
                    + "tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
                    + "tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
                    + "tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone"
                    + " FROM "
                    + "tbl_cliente"
            );
            JRResultSetDataSource jrrs = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/todosClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrrs);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "E:/PROJETOS DEV-GIOVANI/PROJETOS NETBEANS/P-2023/BLImprime/rel/relCliente.pdf");

            File file = new File("E:/PROJETOS DEV-GIOVANI/PROJETOS NETBEANS/P-2023/BLImprime/rel/relCliente.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
