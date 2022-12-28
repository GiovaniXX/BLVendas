package util;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import model.ModelVendas;
import model.ModelVendasProdutos;

public class ImprimePDV {

    public void geraCupomTXT(int pCodigo) throws IOException {

        ControllerProdutos controllerProdutos = new ControllerProdutos();
        ControllerVendas controllerVendas = new ControllerVendas();
        ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();

        // get the sale information from the controllerVendas
        ModelVendas modelVendas = controllerVendas.getVendasController(pCodigo);

        // get the list of products for the sale from the controllerVendas
        listaModelVendasProdutos = controllerVendas.getListaVendasProdutosController(pCodigo);

        // create the text for the receipt
        StringBuilder cupomTXT = new StringBuilder();

        cupomTXT.append(
                "Sale Receipt\n");
        cupomTXT.append(
                "Sale Code: " + pCodigo + "\n");
        cupomTXT.append(
                "Sale Date: " + new SimpleDateFormat("dd/MM/yyyy").format(modelVendas.getDataVenda()) + "\n");
        cupomTXT.append(
                "Client: " + modelVendas.getCliente() + "\n");
        cupomTXT.append(
                "Total: " + modelVendas.getValorTotal() + "\n\n");
        cupomTXT.append(
                "Products:\n");

        // add the list of products to the receipt text
        for (ModelVendasProdutos modelVendasProdutos : listaModelVendasProdutos) {
            cupomTXT.append("Code: " + modelVendasProdutos.getModelProdutos().getIdProduto() + "\n");
            cupomTXT.append("Name: " + modelVendasProdutos.getModelProdutos().getProNome() + "\n");
            cupomTXT.append("Quantity: " + modelVendasProdutos.getModelProdutos().getProQtd() + "\n");
            cupomTXT.append("Price: " + modelVendasProdutos.getModelProdutos().getProValor() + "\n");
            cupomTXT.append("Total: " + modelVendasProdutos.getModelProdutos().getProValor() * modelVendasProdutos.getModelProdutos().getProQtd() + "\n\n");
        }

        // print the receipt
        InputStream stream = new ByteArrayInputStream(cupomTXT.toString().getBytes());
        PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();

        set.add(OrientationRequested.PORTRAIT);

        set.add(
                new JobName("Sale Receipt", null));
        set.add(MediaSizeName.ISO_A4);

        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        DocPrintJob job = PrintServiceLookup.lookupDefaultPrintService().createPrintJob();

        try {
            job.print(new SimpleDoc(stream, flavor,
        } catch  {

        } finally {

        }
    }
}
