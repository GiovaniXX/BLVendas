package DAO;

import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import model.ModelVendas;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class DaoVendas extends ConexaoMySql {

    /**
     * Grava Vendas
     *
     * @param pModelVendas
     * @return int
     */
    public int salvarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + ") VALUES ("
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVenDataVenda() + "',"
                    + "'" + pModelVendas.getVenValorLiquido() + "',"
                    + "'" + pModelVendas.getVenValorBruto() + "',"
                    + "'" + pModelVendas.getVenDesconto() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelVendas getVendasDAO(int pIdVenda) {
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + " FROM "
                    + "tbl_vendas"
                    + " WHERE"
                    + "pk_id_venda = '" + pIdVenda + "'"
                    + "'"
            );
            while (this.getResultSet().next()) {
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendas;
    }

    public ArrayList<ModelVendas> getListaVendasDAO() {
        ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                    + " FROM"
                    + " tbl_vendas"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                listaModelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendas;
    }

    /**
     * Exluir vendas
     *
     * @param pIdVenda
     * @return
     */
    public boolean excluirVendasDAO(int pIdVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas "
                    + " WHERE "
                    + "pk_id_vendas = '" + pIdVenda + "'"
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
     * Atualizar Vendas
     *
     * @param pModelVendas
     * @return
     */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas) {
//        try {
//            this.conectar();
//            return this.executarUpdateDeleteSQL(
//                    "UPDATE tbl_vendas_produtos SET "
//                    + "pk_id_venda_produto = '" + pModelVendas.getIdVendaProduto() + "',"
//                    + "fk_produto = '" + pModelVendas.getProduto() + "',"
//                    + "fk_vendas = '" + pModelVendas.getVendas() + "',"
//                    + "ven_pro_valor = '" + pModelVendas.getVenProValor() + "',"
//                    + "ven_pro_quantidade = '" + pModelVendas.getVenProQuantidade() + "'"
//                    + " WHERE "
//                    + "pk_id_venda_produto = '" + pModelVendas.getIdVendaProduto() + "'"
//                    + ";"
//            );
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        } finally {
//            this.fecharConexao();
//        }
        return true;
    }

    public boolean relatorioVendaDAO(int codigoVenda) {
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
                    + "tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone,"
                    + "tbl_vendas.pk_id_vendas AS tbl_vendas_pk_id_vendas,"
                    + "tbl_vendas.ven_data_venda AS tbl_vendas_ven_data_venda,"
                    + "tbl_vendas.ven_valor_liquido AS tbl_vendas_ven_valor_liquido,"
                    + "tbl_vendas.ven_valor_bruto AS tbl_vendas_ven_valor_bruto,"
                    + "tbl_vendas.ven_desconto AS tbl_vendas_ven_desconto,"
                    + "tbl_vendas_produtos.pk_id_venda_produto AS tbl_vendas_produtos_pk_id_venda_produto,"
                    + "tbl_vendas_produtos.ven_pro_valor AS tbl_vendas_produtos_ven_pro_valor,"
                    + "tbl_vendas_produtos.ven_pro_quantidade AS tbl_vendas_produtos_ven_pro_quantidade,"
                    + "tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
                    + "tbl_produto.pro_nome AS tbl_produto_pro_nome,"
                    + "tbl_produto.pro_valor AS tbl_produto_pro_valor,"
                    + "tbl_produto.pro_estoque AS tbl_produto_pro_estoque"
                    + " FROM "
                    + "tbl_cliente tbl_cliente INNER JOIN tbl_vendas tbl_vendas ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente"
                    + " INNER JOIN tbl_vendas_produtos tbl_vendas_produtos ON tbl_vendas.pk_id_vendas = tbl_vendas_produtos.fk_vendas"
                    + " INNER JOIN tbl_produto tbl_produto ON tbl_vendas_produtos.fk_produto = tbl_produto.pk_id_produto "
                    + " WHERE tbl_vendas.pk_id_vendas = '" + codigoVenda + "';"
            );
            JRResultSetDataSource jrrs = new JRResultSetDataSource(getResultSet());
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ireport/relatoriosVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrrs);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "E:/PROJETOS DEV-GIOVANI/PROJETOS NETBEANS/P-2023/BLVendas/rel/relVendas.pdf");

            File file = new File("E:/PROJETOS DEV-GIOVANI/PROJETOS NETBEANS/P-2023/BLVendas/rel/relVendas.pdf");
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

//    public void gerarRelatorioDAO(int codigoVenda) {
//
//    }
}
