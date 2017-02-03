package mpfcompare.rest;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

import mpfcompare.rest.model.FundTypeDetail;
import mpfcompare.rest.model.ProxySetting;
import mpfcompare.util.MpfWebScrapper;

@Path("/mpf")
public class MpfResource {

	// Application integration
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<FundTypeDetail> getFundTypeDetails() {
		ProxySetting setting = new ProxySetting();
		setting.setProxy("proxy");
		setting.setPort(8080);
		MpfWebScrapper scrapper = new MpfWebScrapper();
		
		ArrayList<FundTypeDetail> scrapFundTypeDetail = new ArrayList<>();
		try {
			scrapFundTypeDetail = scrapper.scrapFundTypeDetail(true, setting);
		} catch (FailingHttpStatusCodeException | IOException e) {
			e.printStackTrace();
		}
		
		return scrapFundTypeDetail;
	}

	// @Produces({"application/json", "application/xml"})
	// public WebResourceList getMyResources() { ... }
	//
	// @GET @Path("/list")
	// @Produces({"application/json", "application/xml"})
	// public WebResourceList getListOfPrinters() { ... }
	//
	// @GET @Path("/jMakiTable")
	// @Produces("application/json")
	// public PrinterTableModel getTable() { ... }
	//
	// @GET @Path("/jMakiTree")
	// @Produces("application/json")
	// public TreeModel getTree() { ... }
	//
	// @GET @Path("/ids/{printerid}")
	// @Produces({"application/json", "application/xml"})
	// public Printer getPrinter(@PathParam("printerid") String printerId) { ...
	// }
	//
	// @PUT @Path("/ids/{printerid}")
	// @Consumes({"application/json", "application/xml"})
	// public void putPrinter(@PathParam("printerid") String printerId, Printer
	// printer) { ... }
	//
	// @DELETE @Path("/ids/{printerid}")
	// public void deletePrinter(@PathParam("printerid") String printerId) { ...
	// }

}
